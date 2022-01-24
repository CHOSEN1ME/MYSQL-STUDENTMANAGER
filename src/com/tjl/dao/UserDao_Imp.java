package com.tjl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tjl.bean.User;
import com.tjl.jdbc.JDBCUtils;

public class UserDao_Imp implements UserDao {
	private static final String SQL_USER_LOGIN = "SELECT type from user2 WHERE uname=? AND upass=?";
	private static final String SQL_USER_INSERT = "INSERT INTO user2 VALUES (id,?,?,2)";
	private static final String SQL_USER_DELETE = "DELETE FROM user2 WHERE uname=?";
	private static final String SQL_USER_UPDATE = "UPDATE  user2 SET upass=? WHERE uname=?";
	private static final String SQL_USER_SELECT = "SELECT * FROM user2 WHERE uname=?";

	@Override
	public int login(User user) {
		// TODO Auto-generated method stub
		//创建连接对象
		Connection conn=JDBCUtils.getConnection();
		PreparedStatement prepareStatement=null;
		ResultSet result=null;
		try {//创建编译环境
			prepareStatement=conn.prepareStatement(SQL_USER_LOGIN);
			//设置sql语句参数
			prepareStatement.setString(1,user.getUname());
			prepareStatement.setString(2,user.getUpass());
			//执行语句
			result = prepareStatement.executeQuery();
			while(result.next()) {//查询当前用户权限
				int type =result.getInt("type");
				return type;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn, prepareStatement, result);
		}

	//创建statement环境
		//执行sql语句
		
		return -1;
	}

	@Override
	public boolean insert(User user) {
		// TODO Auto-generated method stub
		//添加成员
		Connection conn=JDBCUtils.getConnection();
		PreparedStatement prepareStatement=null;
		try {
			prepareStatement = conn.prepareStatement(SQL_USER_INSERT);
			prepareStatement.setString(1,user.getUname());
			prepareStatement.setString(2,user.getUpass());
			int line = prepareStatement.executeUpdate();
			if(line>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn, prepareStatement, null);
		}
		
		return false;
	}

	@Override
	public boolean delete(String uname) {
		// TODO Auto-generated method stub
		//DELETE FROM user2 WHERE uname='看'
		Connection conn=JDBCUtils.getConnection();
		PreparedStatement prepareStatement=null;
		try {
			prepareStatement = conn.prepareStatement(SQL_USER_DELETE);
			prepareStatement.setString(1,uname);
			int line = prepareStatement.executeUpdate();
			if(line>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn, prepareStatement, null);
		}

		
		return false;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		Connection conn=JDBCUtils.getConnection();
		PreparedStatement prepareStatement=null;
		
		try {
			prepareStatement = conn.prepareStatement(SQL_USER_UPDATE);
			prepareStatement.setString(1,user.getUpass());
			prepareStatement.setString(2,user.getUname());
			int line = prepareStatement.executeUpdate();
			if(line>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn, prepareStatement, null);
		}

		
		return false;
		
	}

	@Override
	public User select(String uname) {
		// TODO Auto-generated method stub
		//SELECT * FROM user2 WHERE uname='杨梅'
		Connection conn=JDBCUtils.getConnection();
		PreparedStatement prepareStatement=null;
		
		try {
			prepareStatement = conn.prepareStatement(SQL_USER_SELECT);
			prepareStatement.setString(1,uname);
			ResultSet result = prepareStatement.executeQuery();
		    while (result.next()) {
			int id = result.getInt("id");
			uname = result.getString("uname");
			String upass = result.getString("upass");
			int type = result.getInt("type");
			return new User(id,uname,upass,type);
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn, prepareStatement, null);
		}
		return null;
	}

}
