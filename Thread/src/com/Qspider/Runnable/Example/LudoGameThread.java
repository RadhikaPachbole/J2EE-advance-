package com.Qspider.Runnable.Example;

public class LudoGameThread {

	public static void main(String[] args) {
		Runnable r1=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Chance of play one!");
			}
		};
		Runnable r2=()->{
			for(int i=0;i<10;i++)
				{
				System.out.println("Chance of Play Two!!");
				}
		};
		Runnable r3=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Chance of Play Three!!!");
			}
		};
		Runnable r4=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Chance of Play Four!!!!");
			}
		};
		Runnable r5=()->
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Chance of Play Five!!!!!");
			}
			
		};
		Thread thread = new Thread(r1);
		thread.start();
		Thread thread2 = new Thread(r2);
		thread2.start();
		Thread thread3 = new Thread(r3);
		thread3.start();
		 Thread thread4 = new Thread(r4);
		 thread4.start();
		 Thread thread5 = new Thread(r5);
		 thread5.start();
	}

}
