package com.Methods;
class Test
{
	void nNumber()
	{
		System.out.println("9975844976");
	}
	void nAtm() {
		// TODO Auto-generated method stub
		
	}
	/*final void atmPIN()   //here making method as final coz of security purpose we can't override final method & this final method can't override by using
	        //subclass
	{
		System.out.println("12#@#34");
	}*/
}
class Thief extends Test
{
	@Override
	void nNumber()
	{
		System.out.println("9975844976");
	}
	//@Override
	/*void atmPIN()
	{
		System.out.println("12#@#34");
	}*/
	
}
public class FinalMethod {

	public static void main(String[] args) {
		//whenever we want to secure the data that time make a method as Final
		
		Thief t1=new Thief();
		t1.nNumber();
		//t1.nATM();
		

	}

}
