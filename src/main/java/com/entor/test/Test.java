package com.entor.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entor.service.ProductService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductService ps = (ProductService)context.getBean("productService");
		System.out.println(ps.queryById(1));
	}
}
