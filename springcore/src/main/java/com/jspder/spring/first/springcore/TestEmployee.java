package com.jspder.spring.first.springcore;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		Employee emp=(Employee)ctx.getBean("employee");
		System.out.println(emp);

	}

}
