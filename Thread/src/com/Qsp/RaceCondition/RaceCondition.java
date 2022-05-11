package com.Qsp.RaceCondition;

public class RaceCondition {
	
	static int x=0;
	public  void increment()
	{
		x++;
	}
	public void decrement()
	{
		x--;
	}
	public  void display()
	{
		System.out.println(x);
	}
	

	public static void main(String[] args) {
		RaceCondition r= new RaceCondition();
		
		Runnable r1=()->{
			r.increment();
			
			r.display();
		};
		Runnable r2=()->{
			
			r.decrement();
			r.display();
		};
		
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
		
	}

}
