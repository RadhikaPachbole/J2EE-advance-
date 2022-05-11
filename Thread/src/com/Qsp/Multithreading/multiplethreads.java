package com.Qsp.Multithreading;

public class multiplethreads {

	public static void main(String[] args) {
		Runnable r1=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("1st Thread Executing "+i);
			}
		};
		Runnable r2=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("2nd Thread executing "+i);
			}
		};
		Runnable r3=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("3rd Thread Executing "+i);
			}
		};
		Runnable r4=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("4th Thread Excecuting "+i);
			}
		};
		Thread th1=new Thread(r1);
	                Thread th2 = new Thread(r2);	
	                Thread th3 = new Thread(r3);
	                Thread th4 = new Thread(r4);
	                
	                th1.start();
	                th2.start();
	                th3.start();
	                th4.start();
	                
	                System.out.println("Name of thread 1"+th1.getName());
	                
	                th1.setName("Testing_Names");
	                
	                System.out.println("Updated Name of thread one "+th1.getName());
	                //we can get the name also or we can set the name also
	                
	                //getId()-->Method--->we can get id but we can't set the Id
	                System.out.println("ID for Thread Two is"+th2.getId());
	                
	                //getPriority()--->
	                System.out.println("Looking at the priority of the Thread "+th3.getPriority());
	                th3.setPriority(8);
	                System.out.println("Looking at the updated Priority of thread3 which is "+th3.getPriority());

	}

}
