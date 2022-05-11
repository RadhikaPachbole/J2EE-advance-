package com.Lombok.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Data
@Table(name="Brand")
public class BrandDTO {
	@Id
	@Column(name="BrandId")
	private int brandId;
	@Column(name="BrandName")
	private String bname;
	@Column(name="Contact")
	private long Contact;
	

}
