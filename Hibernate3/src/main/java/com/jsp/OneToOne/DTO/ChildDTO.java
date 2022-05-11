package com.jsp.OneToOne.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Childs_Details")
public class ChildDTO 
{
	@Id
	@Column(name="Child_Name")
	private String name;
	@Column(name="Child_age")
	private int age;
	

}
