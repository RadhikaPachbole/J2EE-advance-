package com.Qsp.Multithreading;

public class ThreadPriorityTesting {

	public static void main(String[] args) {
		//Understanding How the Priority Works
		Runnable r1=()->{
			for(int i=0;i<10;i++) {
				System.out.println("1st Thread Executing"+i);
			}
		};
		Runnable r2=()->{
			for(int i=0;i<0;i++)
			{
				System.out.println("2nd Thread Executing"+i);
			}
		};
		Runnable r3=()->{
			for(int i=0;i<10;i++) {
				System.out.println("3rd Thread Executing"+i);
			}
		};
		Thread th1 = new Thread(r1);
        Thread th2 = new Thread(r2);
        Thread th3 = new Thread(r3);
        
        Runnable r4=()->{
        	for(int i=0;i<10;i++) {
        		System.out.println("4th Thread Executing"+i);
        	}
        };
        Runnable r5=()->{
        	for(int i=0;i<10;i++) {
        		System.out.println("5th Thread Executing priority 10"+i);
        	}
        };
        Runnable r6=()->{
        	for(int i=0;i<10;i++) {
        		System.out.println("6th Thread Executing"+i);
        	}
        };
        Thread th4 = new Thread(r4);
        Thread th5 = new Thread(r5);
        Thread th6 = new Thread(r6);
        
        Runnable r8=()->{
        	for(int i=0;i<10;i++)
        	{
        		System.out.println("8th Thread Executing"+i);
        	}
        };
        Runnable r9=()->{
        	for(int i=0;i<10;i++)
        	{
        		System.out.println("9th Thread Executing"+i);
        	}
        };
        Runnable r10=()->{
        	for(int i=0;i<10;i++)
        	{
        		System.out.println("10th Thread Executing"+i);
        	}
        };
        Runnable r7=()->{
        	for(int i=0;i<10;i++)
        	{
        		System.out.println("7th Thread Executing"+i);
        	}
        };
        Thread th7 = new Thread(r7);
        Thread th8 = new Thread(r8);
        Thread th9 = new Thread(r9);
        Thread th10 = new Thread(r10);
        
        //Setting the Priority Range--->1(low)-10(high)
        th5.setPriority(10);
        th4.setPriority(8);
        th10.setPriority(1);
        
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
        th7.start();
        th8.start();
        th9.start();
        th10.start();
        
                 
			
		}

}


