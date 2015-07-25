package com.isko.app.util.threads;

public class CalcExImpl implements Runnable 
{
	private int a;
	private int b;

	public CalcExImpl(int x, int y)
	{
		a = x;
		b=y;
	}

	public void run() 
	{
		System.out.println("IN RUN METHOD");
		try {
			sub();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	public synchronized void sub() throws InterruptedException 
	{
		
		Thread.sleep(10000);
		System.out.println("SUB" + (a - b));
	}

}
