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
			System.out.println("�����������������룡");
			break;
		case 1:
			//System.out.println("����Ա��¼�ɹ�");
			managerServer();
			break;
			
		case 2:
			System.out.println("ѧ����¼�ɹ�");
			studentServer();
			break;	
		default:
			break;
		}
		}
	}
		
	private static void managerServer() {
		// TODO Auto-generated method stub
		//����Աҳ��
		UserDao_Imp userDao_Imp = new UserDao_Imp();
	while (true) {
		int item= View.managerMenuView();
		boolean flag;
		switch (item) {
		case 0://�˳�
			System.exit(-1);
			break;
		case 1://���ѧ����Ϣ
			User user = View.addMenuView();
			flag = userDao_Imp.insert(user);
			System.out.println(flag?"add success":"add fail");
			break;
		case 2://ɾ��
			String uname= View.deleteMenuView();
			flag = userDao_Imp.delete(uname);
			System.out.println(flag?"delete success":"delete fail");
			break;
		case 3://��ѯ
			User updateUser = View.updataMenuView();
			flag =userDao_Imp.update(updateUser);
		    System.out.println(flag?"update success":"update fail");	
			break;
		case 4://��ѯ
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
