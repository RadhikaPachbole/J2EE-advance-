package com.qspider.program;
class Cricketer{
	Cricketer()
	{
		System.out.println("Object is created");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is Distroyed");
	}
}

public class CricketerDemo {

	public static void main(String[] args) {
      Cricketer c1 = new Cricketer();//1st By null the reference
      c1=null;
      
       Cricketer c2=new Cricketer();//2nd By assigning reference to another
       Cricketer c3=new Cricketer();
       c2=c3;
       
       //3rd By Anonymous object there is no reference
       
       new Cricketer();
       
      System.gc();
		
        
	}

}
