package com.tjl.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tjl.bean.User;
import com.tjl.view.View;

public class ViewTest {
	@Test//测试登录页面
	public void indexViewTest() throws Exception {
		User user1 = View.indexView();
		System.out.println(user1);
		
	}
	@Test//管理员页面
	public void managerViewTest() throws Exception {
		int item =View.managerMenuView();
		System.out.println(item);
	}

@Test//添加学生信息页面
public void addMenuViewTest() throws Exception {
	User user = View.addMenuView();
	System.out.println(user);
}
}
