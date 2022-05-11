package com.jsp.JDBC.dbtoCollection;

public class Students {
	int studentsId;
	String studentsName;
	String emailId;
	long phoneNumber;
	String address;
	public void setStudentsId(int studentsId) {
		this.studentsId = studentsId;
	}
	public void setStudentsName(String studentsName) {
		this.studentsName = studentsName;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Students [studentsId=" + studentsId + ", studentsName=" + studentsName + ", emailId=" + emailId
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
	
	

}
