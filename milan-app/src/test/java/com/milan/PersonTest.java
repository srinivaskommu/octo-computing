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
	 */
	public static void main(String[] args) {
	//	Student robert = new Student();
	

		Professor nancy = new Professor("NAncy", 165, 135, 'F');
		nancy.setEmployeeId("TAMU300780");

		System.out.println(nancy.getName() + " details");
		System.out.println(" Name" + nancy.getName());
		System.out.println(" height" + nancy.getHeight());
		System.out.println(" weight" + nancy.getWeight());
		System.out.println(" gender" + nancy.getGender());

	}

}
