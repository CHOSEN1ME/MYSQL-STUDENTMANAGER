package com.tjl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.management.remote.rmi.RMIConnectionImpl;

public class JDBC {
	public static void main(String[] args) {
		try {
			//加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//连接数据库,获得连接对象
			System.out.println("加载驱动成功");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?serverTimezone=UTC&useSSL=false","root","123456");
			System.out.println("连接成功");
			//创建环境
			Statement statement = conn.createStatement();
			//执行sql查询语句，返回结果
			ResultSet result = statement.executeQuery("select * from db ");
			while (result.next()) {//检查是否有数据
				System.out.print(result.getString("Db")+" ");//输出数据
				System.out.println(result.getString("User")+" ");//输出数据
			
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("加载驱动失败");
			System.out.println("连接失败");
		}
	}

}
