package com.tjl.dao;

import com.tjl.bean.User;

public interface UserDao {
	//int -1 ��¼ʧ�� 1����Ա��¼ 2ѧ����¼
	int login(User user);
	//true�ɹ� falseʧ��
	boolean insert(User user);
	
	boolean delete(String uname);
	
	boolean update(User user);

	User select(String uname);


	
}
