package com.Qsp.thread.yeild;

public class SleepMethodExample {

	public static void main(String[] args) {
		Runnable r=()->{
			try {
				Thread.sleep(5000);     //sleep method execute as per time assign in thread
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			for(int i=0;i<20;i++)
			{
				System.out.println("1st Thread "+i+" instance running");
			}
		};
		Runnable r1=()->{
			for(int i=0;i<20;i++)
			{
				System.out.println("2nd Thread "+i+ " instance running");
			}
		};
		Runnable r2=()->{
			for(int i=0;i<20;i++)
			{
				System.out.println("3rd Thread "+i+ " instance running");
			}
		};
		Thread t1=new Thread(r);
		Thread t2=new Thread(r1);
		Thread t3=new Thread(r2);
		t1.start();
		t2.start();
		t3.start();

	}

}
