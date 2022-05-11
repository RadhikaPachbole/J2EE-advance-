package com.Methods;
//making an Final class
 final class test
{
	 //can't inherit Final class we use final keyword class for data security purpose subclass also dosen't override final class
	 void mNumber()
	 {
	 System.out.println("9975844976");
	 }
	 void atmPIN(){
			System.out.println("123@456");
		}
}
class Thief extend test  //cant extend final test class
{
	void mNumber(){
		System.out.println();
	}
	void atmPIN(){
		System.out.println("123@456");
	}
}
public class FinalClass {

	public static void main(String[] args) {
		Thief t1=new Thief();
		t1.mNumber();
		t1.atmPIN();
		
	}

}
