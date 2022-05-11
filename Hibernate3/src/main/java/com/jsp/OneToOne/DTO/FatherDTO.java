package com.jsp.OneToOne.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Fathers_Details")
public class FatherDTO {
	@Id
	@Column(name = "fathers_name")
	private String name;
	@Column(name = "fathers_age")
	private int age;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "Father_Child", joinColumns = @JoinColumn(referencedColumnName = "fathers_name"), inverseJoinColumns = @JoinColumn(referencedColumnName = "child_name"))

	private ChildDTO child;

}
