package com.controller;

import com.tjl.bean.User;
import com.tjl.dao.UserDao_Imp;
import com.tjl.view.View;

public class Control {
	public static void main(String[] args) {
		while (true) {
			 
	
		User user = View.indexView();
		UserDao_Imp userDao_Imp = new UserDao_Imp();
		int type = userDao_Imp.login(user);
		switch (type) {
		case -1:
			System.out.println("输入有误请重新输入！");
			break;
		case 1:
			//System.out.println("管理员登录成功");
			managerServer();
			break;
			
		case 2:
			System.out.println("学生登录成功");
			studentServer();
			break;	
		default:
			break;
		}
		}
	}
		
	private static void managerServer() {
		// TODO Auto-generated method stub
		//管理员页面
		UserDao_Imp userDao_Imp = new UserDao_Imp();
	while (true) {
		int item= View.managerMenuView();
		boolean flag;
		switch (item) {
		case 0://退出
			System.exit(-1);
			break;
		case 1://添加学生信息
			User user = View.addMenuView();
			flag = userDao_Imp.insert(user);
			System.out.println(flag?"add success":"add fail");
			break;
		case 2://删除
			String uname= View.deleteMenuView();
			flag = userDao_Imp.delete(uname);
			System.out.println(flag?"delete success":"delete fail");
			break;
		case 3://查询
			User updateUser = View.updataMenuView();
			flag =userDao_Imp.update(updateUser);
		    System.out.println(flag?"update success":"update fail");	
			break;
		case 4://查询
			String uname1 = View.selectMenuView();
			User selectUser = userDao_Imp.select(uname1);
			View.printUser(selectUser);	
			break;
		default:
			break;
		}
	}
	}

	private static void studentServer() {
		// TODO Auto-generated method stub
		
	}


}
