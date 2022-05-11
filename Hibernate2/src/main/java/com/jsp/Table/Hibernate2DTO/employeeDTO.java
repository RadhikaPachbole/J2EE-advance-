package com.jsp.Table.Hibernate2DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Employee")
public class employeeDTO 
{
	@Id
	@Column(name="emp_id")
	private int id;
	
	@Column(name="emp_name")
	private String name;
	
	@Column(name="emp_Email")
	private String email;
	
	@Column(name="emp_phno")
	private long phno;
	
	@Column(name="emp_salary")
	private double salary;
	
	@OneToOne
	private employeeDTO manager;
	
	

}
