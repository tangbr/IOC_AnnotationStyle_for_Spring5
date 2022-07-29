package com.atguigu.spring5.testDemo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring5.Config.SpringConfig;
import com.atguigu.spring5.service.UserService;

public class TestSpring5 {
	
	@Test
	public void testService1() {
		@SuppressWarnings("resource")
		ApplicationContext context 
		= new ClassPathXmlApplicationContext ("bean11.xml");
		UserService userService = context.getBean("userService", UserService.class);
		System.out.println(userService);
		userService.add();
	}
	
	
	
	@Test
	public void testService2() {
		@SuppressWarnings("resource")
		ApplicationContext context 
		= new AnnotationConfigApplicationContext(SpringConfig.class);
		UserService userService = context.getBean("userService", UserService.class);
		System.out.println(userService);
		userService.add();
	}
}
