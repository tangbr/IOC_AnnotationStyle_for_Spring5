package com.atguigu.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("dao add .......");
	}

}
