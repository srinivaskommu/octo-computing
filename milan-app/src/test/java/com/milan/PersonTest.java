/**
 * 
 */
package com.milan;

/**
 * @author srinivas_kommu
 *
 */
public class PersonTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("MAIN method STARTED");
		displayResponseFromASlowMethod();
		System.out.println("MAIN method ENDED");

	}

	private static void displayResponseFromASlowMethod() throws InterruptedException 
	{
		System.out.println("SLOW method started");
		Thread.sleep(10000);
		
		System.out.println("SLOW method ended");
	}

}
