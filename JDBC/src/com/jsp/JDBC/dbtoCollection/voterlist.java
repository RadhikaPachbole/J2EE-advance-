package com.jsp.JDBC.dbtoCollection;

public class voterlist {
	int voter_id;
	String name;
	long phone_no;
	String address;
	int ward_no;
	public void setVoter_id(int voter_id) {
		this.voter_id = voter_id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setWard_no(int ward_no) {
		this.ward_no = ward_no;
	}
	@Override
	public String toString() {
		return "voterlist [voter_id=" + voter_id + ", name=" + name + ", phone_no=" + phone_no + ", address=" + address
				+ ", ward_no=" + ward_no + "]";
	}
	
	

}
