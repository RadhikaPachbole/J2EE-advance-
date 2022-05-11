package com.qspider.program;

public class TestGarbage {

	public static void main(String[] args) {
		
		//Create Object for Student
		//1st By assigning null value
		Student s1 =new Student("Baburao",17);
		System.out.println(s1.name);
		System.out.println(s1.age);
		s1=null;
		System.gc();  //gc method present in system class .system class is an runtime class present in JVM.gc method automatically calls JVM.
		//System.out.println(s1.name);
		
		//2nd By Assigning different object
		Book b1=new Book(101,"JAVA","Balguruswami");
		Book b2=new Book(102,"Sql","Ajay sir");
		System.out.println(b1.id+" "+b1.bookname+" "+b1.Authorname);
		
		
		b1=b2;
		System.gc();
		
		//3rd anonymous
		new Book(103,"Marathi","R.S.Gadkari");
		System.gc();
		
		
		
		
		
		
		
	}

}
