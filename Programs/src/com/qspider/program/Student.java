package com.qspider.program;
public class Student {

	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//called finalize method before deleting the object finalize method remove the resources of unused object

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize Method called");
		
	}
	
		

}


