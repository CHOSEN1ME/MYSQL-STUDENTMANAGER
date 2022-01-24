package com.tjl.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import com.tjl.bean.User;
import com.tjl.dao.UserDao_Imp;
import com.tjl.jdbc.JDBCUtils;

public class JDBCUtilsTest {
	@Test
	public void jdbcConnectionTest() throws Exception {
		Connection conn = JDBCUtils.getConnection();
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery("select * from db ");
		while (result.next()) {//����Ƿ�������
			System.out.print(result.getString("Db")+" ");//�������
			System.out.println(result.getString("User")+" ");//�������
		
			
		}
	}
@Test
public void loginTest() throws Exception {
	UserDao_Imp userDao_Imp=new UserDao_Imp();
	User user =new User("С��","xz");
	int type =userDao_Imp.login(user);
	System.out.println(type);
	
	
	
}
//��������û�
@Test
public void insertTest() throws Exception {
	UserDao_Imp userDao_Imp = new UserDao_Imp();
	User user = new User("��÷","ym");
	boolean flag = userDao_Imp.insert(user);
	System.out.println(flag);
	
	
}
@Test//����ɾ��
public void deleteTest() throws Exception {
	UserDao_Imp userDao_Imp = new UserDao_Imp();
	User user = new User("��÷","ym");
	boolean flag = userDao_Imp.delete(user.getUname());
	System.out.println(flag);
}
@Test//�����޸��û�
public void updateTest() throws Exception {
	UserDao_Imp userDao_Imp = new UserDao_Imp();
	User user = new User("��÷","ym");
	boolean flag = userDao_Imp.update(user);
	System.out.println(flag);
}
@Test//���Բ�ѯ�û�
public void selectTest() throws Exception {
	UserDao_Imp userDao_Imp = new UserDao_Imp();
	User user = new User("��÷","ym");
	User user1=userDao_Imp.select(user.getUname());
	System.out.println(user1);
}
}
