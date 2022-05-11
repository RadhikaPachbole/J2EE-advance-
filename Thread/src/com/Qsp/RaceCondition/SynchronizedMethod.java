package com.Qsp.RaceCondition;

public class SynchronizedMethod {
	static int x=0;
	public synchronized void increment() {
		x++;
	}
	public synchronized void  decrement() {
		x--;
	}
	public synchronized void display() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		SynchronizedMethod s=new SynchronizedMethod();
		Runnable r1=()->{
			s.increment();
			s.display();
		};
		Runnable r2=()->{
			s.decrement();
			s.display();
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		
	}

}
