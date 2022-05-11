package com.Qsp.thread.yeild;

public class joinMethod1 {

	public static void main(String[] args) {
		Runnable r1=()->{
			for(int i=0;i<20;i++)
			{
				System.out.println("1st Thread Execute "+i);
			}
		};
		Runnable r2=()->{
			for(int i=0;i<20;i++)
			{
				System.out.println("2nd Thread Execute "+i);
			}
		};
	Runnable r3=()->{
		for(int i=0;i<20;i++)
		{
			System.out.println("3rd Thread Execute "+i +"Using Join Method");
		}
	};
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	Thread t3=new Thread(r3);
	t3.start();
	try {
		t3.join();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	t1.start();
	t2.start();
  }
}
