package com.tjl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.management.remote.rmi.RMIConnectionImpl;

public class JDBC {
	public static void main(String[] args) {
		try {
			//��������
			Class.forName("com.mysql.cj.jdbc.Driver");
			//�������ݿ�,������Ӷ���
			System.out.println("���������ɹ�");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?serverTimezone=UTC&useSSL=false","root","123456");
			System.out.println("���ӳɹ�");
			//��������
			Statement statement = conn.createStatement();
			//ִ��sql��ѯ��䣬���ؽ��
			ResultSet result = statement.executeQuery("select * from db ");
			while (result.next()) {//����Ƿ�������
				System.out.print(result.getString("Db")+" ");//�������
				System.out.println(result.getString("User")+" ");//�������
			
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("��������ʧ��");
			System.out.println("����ʧ��");
		}
	}

}
