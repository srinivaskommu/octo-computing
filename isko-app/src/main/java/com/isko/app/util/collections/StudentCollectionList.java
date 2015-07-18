/**
 * 
 */
package com.isko.app.util.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import com.isko.app.domain.Student;

/**
 * @author srinivas_kommu
 *	//to store elements in run time without worryin abou the size of the array.
 */
public class StudentCollectionList {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		

		List<String> sstudentNames = new ArrayList<String>();
		System.out.println("total no of students attended concert "+sstudentNames.size());

		
		System.out.println("Student Colleciton Software");
		Scanner input = new Scanner(System.in);
		String name = "";
		String isStudentsAvailable;

		do {
			System.out.println("Enter Name of Student");
			name = input.next();
			sstudentNames.add(name);
			System.out.println("Did you find any more students..??? enter 'y'..");
			isStudentsAvailable = input.next();
			
		}while(isStudentsAvailable.equalsIgnoreCase("Y"));
		
		
		System.out.println("total no of students attended concert "+sstudentNames.size());
		System.out.println("student names as follows ");
		
		
		//enhanced for loop-->
		for(String studentName: sstudentNames)
		{
			System.out.println(studentName);
		}

	
	}

}
