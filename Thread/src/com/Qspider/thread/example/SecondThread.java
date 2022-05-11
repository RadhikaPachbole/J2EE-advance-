package com.Qspider.thread.example;

public class SecondThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("Second Thread is Created!!");
		}
	}

}
