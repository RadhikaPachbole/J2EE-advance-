package com.jspder.spring.first.springcore;
//POJO class;-This class consist getters & setters -->Fully Encapsulated Class
public class Employee 
{
	private String name;
	private String id;
	private double sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public Employee(String name, String id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}
	
	
	
	

}
