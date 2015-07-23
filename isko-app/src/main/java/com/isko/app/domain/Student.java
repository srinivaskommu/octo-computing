package com.isko.app.domain;

public class Student 
{
	static String schoolName = "UTD";
	private String firstName;
	private String lastName;
	private Student(String f, String l)
	{
		firstName = f;
		lastName = l;
		
	}
	
	public static Student getInstance(String f, String l)
	{
		return new Student(f,l);
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	
}