package com.niit.shopping;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopping.model.User;

public class UserTest {

	static AnnotationConfigApplicationContext context;
	public static void main(String[] args)
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		// TODO Auto-generated method stub
		User user=(User)context.getBean("user");
		System.out.println("user created test");

	}

}
