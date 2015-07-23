package com.isko.app.util.threads;

public class ThreadExample {
	private int a;
	private int b;

	public ThreadExample(int a1, int b1) {
		a = a1;
		b = b1;

	}




	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("IAM IN MAIN METHOD");
		ThreadExample ex = new ThreadExample(20, 10);

		System.out.println("STARTING SEPARATE THREAD FOR SUM");
		CalcExThread thread = new CalcExThread(20, 10);
		thread.start();
		

		System.out.println("STARTING SEPARATE THREAD FOR SUB");
		CalcExImpl thread2 = new CalcExImpl(20, 10);
		Thread a = new Thread(thread2);
		a.start();
		
		System.out.println("MAIN COMPLETED");

	}

}