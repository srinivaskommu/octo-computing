package com.milan.domain;

import java.io.FileNotFoundException;

public class StudentTest {

	public StudentTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		Student robert = new Student();
		robert.setFirstName("robert");
		robert.setLastName("kloss");
		
		Student robertsBro = new Student();
		robertsBro.setFirstName("robert");
		robertsBro.setLastName("kloss");
		
		
		System.out.println(robertsBro.getFirstName().length());
		System.out.println(robertsBro.getFirstName().toUpperCase());
		System.out.println("java class".toUpperCase());
		System.out.println("java class      ".indexOf('v'));
		
		
		
		//String random = "srini,200WO1,CS101J";
		String random = new String("srini,200WO1,CS101J        ");
		
		System.out.println(random+"text to add in to the existing");
		
		System.out.println(random);
		
		
		StringBuffer sb = new StringBuffer("srini,200WO1,CS101J        ");
		System.out.println("before"+sb);
		
		
//		StringBuilder sb1 = new StringBuilder(str);
		
		sb.append("text to add in to the existing");
		System.out.println("after"+sb);
		System.out.println(sb);
		
		
		String parts[] = random.split(",");
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		System.out.println(parts[2]);

		
		
		
		String pricetoPrint = "200.30";
		String pricetoSell = "200.31";
		

		
		 double total = Double.parseDouble(pricetoPrint) + Double.parseDouble(pricetoSell);
		
		

			
		
		
		
	
		
	
	}
	
	public static Student cloneRobert(Student robert) throws CloneNotSupportedException, ObjectNullException{
		
		if(robert==null)
			throw new ObjectNullException();
		
		Student robertlilBro = robert.clone();
		return robertlilBro;
	}

}