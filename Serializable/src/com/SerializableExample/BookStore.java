package com.SerializableExample;

public class BookStore {
	int Bookid;
	String Bname;
	double price;
	
	

	public BookStore(int bookid, String bname, double price) {
		super();
		Bookid = bookid;
		this.Bname = bname;
		this.price = price;
	}
	{
		System.out.println("Welcome to book store");
	}
	
	public void printInvoice(BookStore b1,int quantity)
	{
		double price=price(b1,quantity);
		System.out.println("Book Purchase "+ b1.Bname);
		System.out.println("Book Id :"+b1.Bookid);
		System.out.println("Quantity Purchased :"+ quantity +" book is "+price+"Rs");
		
	}
	public double price(BookStore b,int quantity)
	{
		double price=b.price*quantity;
		return price;
	}
	


	public static void main(String[] args) {
		BookStore b1 = new BookStore(101,"Wings of Fire",400.35);
		b1.printInvoice(b1, 10);

	}

}
