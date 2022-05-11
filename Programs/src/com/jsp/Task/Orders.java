package com.jsp.Task;

public class Orders {
	private int id;
	private int customerid;
	private int orderdate;
	private String status;
	private int price;
	public static void updateOrderStatus()
	{
		System.out.println("order status is update");
	}
	public static void placeOrder()
	{
		System.out.println("Order is Placed");
	}
	public static void cancelOrder()
	{
		System.out.println("Order Cancel Successfully!!!");
	}
	public static void main(String []args)
	{
		Customer obj3=new Customer();
		
	}

}
