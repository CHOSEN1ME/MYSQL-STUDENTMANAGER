package com.tjl.dao;

import com.tjl.bean.User;

public interface UserDao {
	//int -1 登录失败 1管理员登录 2学生登录
	int login(User user);
	//true成功 false失败
	boolean insert(User user);
	
	boolean delete(String uname);
	
	boolean update(User user);

	User select(String uname);


	
}
