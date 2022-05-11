package com.jsp.Task;

public class OrderDetails {
	private int id;
	private int orderid;
	private String shippingAddress;
	private String shippingType;
	private int shippingCost;
	private String billingAddress;
	private int createdDate;
	public  void cancelOrder()
	{
		System.out.println("Order Cancel Successfully!!");
	}
	

	public static void main(String[] args) {
		OrderDetails obj=new OrderDetails();
		obj.cancelOrder();
		Orders obj1=new Orders();
		
	}

}
