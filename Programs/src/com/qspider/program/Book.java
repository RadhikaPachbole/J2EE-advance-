package com.qspider.program;


public class Book {

	int id;
	String bookname;
	String Authorname;

	public Book(int id, String bookname, String authorname) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.Authorname = authorname;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize method called");
	}
    
}
