package com.qspider.program;

public class TestRestaurant {
 private int foodI;
 private String name;
 private String place;
 private int pincode;
public TestRestaurant(int foodI, String name, String place, int pincode) {
	super();
	this.foodI = foodI;
	this.name = name;
	this.place = place;
	this.pincode = pincode;
}

public int getFoodI() {
	return foodI;
}
public void setFoodI(int foodI) {
	this.foodI = foodI;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public TestRestaurant() {
	super();
}
public void display()
{
    System.out.println("Total Food Item::"+foodI);
    System.out.println("Food Name::"+name);
   
}
public void address()
{
   System.out.println("Place of Food Item::"+place+" "+"Pin:-"+pincode);	
}
@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is Deleted");
	}

}
