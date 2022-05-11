package com.Qspider.Runnable.Example;

public class TestRunnable {

	public static void main(String[] args) {
		
		Runnable r=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("First Thread Running!!");
			}
		};
		Runnable r1=()->
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Second Thread Running!!!");
			}
		};
		Thread thread = new Thread(r);
		thread.run();
	      
		Thread thread2 = new Thread(r1);
	      thread2.run();

	}

}
