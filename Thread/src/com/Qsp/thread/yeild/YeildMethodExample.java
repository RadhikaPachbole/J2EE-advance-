package com.Qsp.thread.yeild;

public class YeildMethodExample {
// yeild()-->pause the execution of current thread and give the chance to anther thread having same or
	//equal priority
	public static void main(String[] args) {
		Runnable r=()->{
			Thread.yield();
			for(int i=0; i<20 ;i++)
			{
				System.out.println("1st thread running");
			}
		};
		Runnable r1=()->{
			for (int i=0;i<20;i++)
			{
				System.out.println("2nd Thread Running");
			}
		};
		Runnable r2=()->{
			for(int i=0;i<20;i++)
			{
				System.out.println("3rd Thread Running");
			}
		};
		Runnable r3=()->{
			for(int i=0;i<20;i++)
			{
				System.out.println("4th Thread Running");
			}
		};
		Thread t1=new Thread(r);
		Thread t2=new Thread(r1);
		Thread t3=new Thread(r2);
		Thread t4=new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t2.setPriority(10);
	}

}
