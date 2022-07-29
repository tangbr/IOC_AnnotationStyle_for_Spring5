package com.atguigu.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
//import javax.annotation.Resource;
import com.atguigu.spring5.dao.UserDao;

@Service
public class UserService {
	
	@Value(value="abccde")
	private String name;
	
	//定义dao类型属性, 不需要添加set方法，添加注入属性注解
	  @Autowired
	  @Qualifier(value="userDaoImpl")
	  private UserDao userDao;
	 
	
//	@Resource deprecated?
//	private UserDao userDao;
	
	public void add() {
		System.out.println("service add........."+name);
		userDao.add();
	}
}
