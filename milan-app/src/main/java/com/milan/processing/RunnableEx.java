package com.milan.processing;

public class RunnableEx implements Runnable  
{
	String name;
//	public RunnableEx(String name)
//	{
//		this.name = name;
//	
//	}

	public void setName(String name) {
		this.name = name;
	}


	public void run()
	{
	 depositAmount();
	}
	
	
	private void depositAmount() 
	{
		System.out.println("THREAD STATRTED"+this.name);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("THREAD ENDED");
		
	}


	public static void main(String s[])
	{
//		System.out.println("MAIN METHOD STARTED");
//		
//		RunnableEx thread1 = new RunnableEx();
//		thread1.setName("thread-first");
//		thread1.
//		
//		RunnableEx thread2 = new RunnableEx("thread-second");
//		thread2.run();
//	
//		System.out.println("MAIN METHOD ENDED");
	}
	

}
