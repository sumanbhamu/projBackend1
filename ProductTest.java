package com.niit.shopping;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopping.model.Product;
import com.niit.shopping.model.User;

public class ProductTest {

	
	static AnnotationConfigApplicationContext context;
	
	public static void main(String[] args) 
	{
		
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		// TODO Auto-generated method stub
		Product product=(Product)context.getBean("product");
		System.out.println("product created test");

		// TODO Auto-generated method stub

	}

}
