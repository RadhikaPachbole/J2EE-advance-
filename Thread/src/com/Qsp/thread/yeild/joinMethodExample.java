package com.Qsp.thread.yeild;

public class joinMethodExample {
	//join method whenever u apply this method this thread execute completely 1st then give chance to other thread

	public static void main(String[] args){
		Runnable r=()->{
			for(int i=0;i<20;i++)
			{
				System.out.println("1st Thread "+i+" instance Running");
			}
		};
		Runnable r1=()->{
			for(int i=0;i<20;i++)
			{
				System.out.println("2nd Thread "+i+" instance Running");
			}
		};
		Runnable r2=()->{
			for(int i=0;i<20;i++)
			{
				System.out.println("3rd Thread "+i+" instance Running");
			}
		};
		Thread t1=new Thread(r);
		Thread t2=new Thread(r1);
		Thread t3=new Thread(r2);
			
	    t2.start();
	    try {
	    	
			t2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    t1.start();	
	    t3.start();
		
		
		
		
	}

}
