package com.tjl.view;

import java.util.Scanner;

import com.tjl.bean.User;

public class View {
	private static Scanner input = new Scanner(System.in);
	//��ҳ
	public static User indexView() {
		System.out.println("***********************");
		System.out.println("*******\t\tѧ����Ϣϵͳ\t\t*************");
		System.out.println("*******\t\t�������ʾ����\t\t**************");
		System.out.println("*******\t\t�������˺ţ�\t\t****************");
		String uname = input.nextLine();
		
		System.out.println("******\t\t����������*****************");
		String upass = input.nextLine();
		System.out.println("***********************");
		System.out.println("***********************");
		return new User(uname,upass);
		
	}
	public static int managerMenuView() {
		System.out.println("***********************");
		System.out.println("*******\t\t����Աҳ��\t\t*************");
		System.out.println("*******\t\t�������ʾ����\t\t**************");
		System.out.println("*******\t\t0.�˳�\t\t****************");
		
		System.out.println("******\t\t1.���ѧ����Ϣ*****************");
		System.out.println("******\t\t2.ɾ��ѧ����Ϣ*****************");
		System.out.println("******\t\t3.�޸�ѧ����Ϣ*****************");
		System.out.println("******\t\t4.��ѯѧ����Ϣ*****************");
		String type =input.nextLine();
		int item=Integer.parseInt(type);//ת��int
		if(item<0||item>4) {//�ж��û�����
			System.out.println("������������������");
			return managerMenuView();
			
		}
		return  item;
		
	}
//����Աҳ��
	public static User addMenuView() {
		System.out.println("***********************");
		System.out.println("*******\t\t�������ʾ����\t\t*************");
		System.out.println("*******\t\t�������˺ţ�\t\t**************");
		System.out.println("*******\t\t�������˺�\t\t****************");
		String uname = input.nextLine();
		
		System.out.println("******\t\t����������*****************");
		String upass = input.nextLine();
		System.out.println("***********************");
		System.out.println("***********************");
		return new User(uname,upass);
	}

public static String deleteMenuView() {
	System.out.println("***********************");
	System.out.println("*******\t\t�������ʾ����\t\t*************");
	System.out.println("*******\t\t������ɾ��ѧ���˺ţ�\t\t**************");
	System.out.println("*******\t\t�������˺�\t\t****************");
	String uname = input.nextLine();
	System.out.println("***********************");
	System.out.println("***********************");
	return uname;
	
	
	
}
public static User updataMenuView() {
	System.out.println("***********************");
	System.out.println("*******\t\t�������ʾ����\t\t*************");
	System.out.println("*******\t\t�������˺ţ�\t\t**************");
	System.out.println("*******\t\t�������˺�\t\t****************");
	String uname = input.nextLine();
	
	System.out.println("******\t\t������������*****************");
	String upass = input.nextLine();
	System.out.println("***********************");
	System.out.println("***********************");
	return new User(uname,upass);
}
public static String selectMenuView() {
	System.out.println("***********************");
	System.out.println("*******\t\t�������ʾ����\t\t*************");
	System.out.println("*******\t\t�������ѯѧ���˺ţ�\t\t**************");
	System.out.println("*******\t\t�������˺�\t\t****************");
	String uname = input.nextLine();
	System.out.println("***********************");
	System.out.println("***********************");
	return uname;
	
	
	
}
public static void printUser(User user){
	System.out.println("id"+user.getId());
	System.out.println("�û���"+user.getUname());
	System.out.println("����"+user.getUpass());
	if (user.getType()==1) {
		System.out.println("�û�Ȩ�ޣ�����Ա");
	}else{
		System.out.println("�û�Ȩ�ޣ�ѧ��");
	}
	
	
}
}
