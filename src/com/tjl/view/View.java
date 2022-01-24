package com.tjl.view;

import java.util.Scanner;

import com.tjl.bean.User;

public class View {
	private static Scanner input = new Scanner(System.in);
	//首页
	public static User indexView() {
		System.out.println("***********************");
		System.out.println("*******\t\t学生信息系统\t\t*************");
		System.out.println("*******\t\t请根据提示操作\t\t**************");
		System.out.println("*******\t\t请输入账号：\t\t****************");
		String uname = input.nextLine();
		
		System.out.println("******\t\t请输入密码*****************");
		String upass = input.nextLine();
		System.out.println("***********************");
		System.out.println("***********************");
		return new User(uname,upass);
		
	}
	public static int managerMenuView() {
		System.out.println("***********************");
		System.out.println("*******\t\t管理员页面\t\t*************");
		System.out.println("*******\t\t请根据提示操作\t\t**************");
		System.out.println("*******\t\t0.退出\t\t****************");
		
		System.out.println("******\t\t1.添加学生信息*****************");
		System.out.println("******\t\t2.删除学生信息*****************");
		System.out.println("******\t\t3.修改学生信息*****************");
		System.out.println("******\t\t4.查询学生信息*****************");
		String type =input.nextLine();
		int item=Integer.parseInt(type);//转换int
		if(item<0||item>4) {//判断用户输入
			System.out.println("输入有误，亲重新输入");
			return managerMenuView();
			
		}
		return  item;
		
	}
//管理员页面
	public static User addMenuView() {
		System.out.println("***********************");
		System.out.println("*******\t\t请根据提示操作\t\t*************");
		System.out.println("*******\t\t请输入账号：\t\t**************");
		System.out.println("*******\t\t请输入账号\t\t****************");
		String uname = input.nextLine();
		
		System.out.println("******\t\t请输入密码*****************");
		String upass = input.nextLine();
		System.out.println("***********************");
		System.out.println("***********************");
		return new User(uname,upass);
	}

public static String deleteMenuView() {
	System.out.println("***********************");
	System.out.println("*******\t\t请根据提示操作\t\t*************");
	System.out.println("*******\t\t请输入删除学生账号：\t\t**************");
	System.out.println("*******\t\t请输入账号\t\t****************");
	String uname = input.nextLine();
	System.out.println("***********************");
	System.out.println("***********************");
	return uname;
	
	
	
}
public static User updataMenuView() {
	System.out.println("***********************");
	System.out.println("*******\t\t请根据提示操作\t\t*************");
	System.out.println("*******\t\t请输入账号：\t\t**************");
	System.out.println("*******\t\t请输入账号\t\t****************");
	String uname = input.nextLine();
	
	System.out.println("******\t\t请输入新密码*****************");
	String upass = input.nextLine();
	System.out.println("***********************");
	System.out.println("***********************");
	return new User(uname,upass);
}
public static String selectMenuView() {
	System.out.println("***********************");
	System.out.println("*******\t\t请根据提示操作\t\t*************");
	System.out.println("*******\t\t请输入查询学生账号：\t\t**************");
	System.out.println("*******\t\t请输入账号\t\t****************");
	String uname = input.nextLine();
	System.out.println("***********************");
	System.out.println("***********************");
	return uname;
	
	
	
}
public static void printUser(User user){
	System.out.println("id"+user.getId());
	System.out.println("用户名"+user.getUname());
	System.out.println("密码"+user.getUpass());
	if (user.getType()==1) {
		System.out.println("用户权限：管理员");
	}else{
		System.out.println("用户权限：学生");
	}
	
	
}
}
