package com.isko.app.util.collections;

import java.util.Scanner;

import com.isko.app.domain.Student;

public class StudentArray 
{

	public static void main(String[] x) 
	{
		
		
		//Arrays--are fixed in length--they can not grow dynamically
		
		String names[] =  new String[10];//--- fixed sized
		double prices[] = new double[10];
		Student studenlist[] = new Student[10];
		
		System.out.println("Student Colleciton Software");
		Scanner input = new Scanner(System.in);
		String name = "";
		String isStudentsAvailable;
		int i = 0;
		do {
			System.out.println("Enter Name of Student");
			name = input.next();
			names[i] = name;
			i++;
			
			System.out.println("Did you find any more students..??? enter 'y'..");
			
			isStudentsAvailable = input.next();
			
		}while(isStudentsAvailable.equalsIgnoreCase("Y"));
		
	
		
		
		

	}

}
