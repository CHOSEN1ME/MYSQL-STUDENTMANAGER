package com.tjl.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tjl.bean.User;
import com.tjl.view.View;

public class ViewTest {
	@Test//���Ե�¼ҳ��
	public void indexViewTest() throws Exception {
		User user1 = View.indexView();
		System.out.println(user1);
		
	}
	@Test//����Աҳ��
	public void managerViewTest() throws Exception {
		int item =View.managerMenuView();
		System.out.println(item);
	}

@Test//���ѧ����Ϣҳ��
public void addMenuViewTest() throws Exception {
	User user = View.addMenuView();
	System.out.println(user);
}
}
