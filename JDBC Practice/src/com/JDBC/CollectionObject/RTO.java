package com.JDBC.CollectionObject;

public class RTO 
{
	
  int r_id;
  String name;
  String address;
  long ph_no;
public void setR_id(int r_id) {
	this.r_id = r_id;
}
public void setName(String name) {
	this.name = name;
}
public void setAddress(String address) {
	this.address = address;
}
public void setPh_no(long ph_no) {
	this.ph_no = ph_no;
}
@Override
public String toString() {
	return "RTO [r_id=" + r_id + ", name=" + name + ", address=" + address + ", ph_no=" + ph_no + "]";
}
 
  
  

}
