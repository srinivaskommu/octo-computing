package com.milan.domain.ioc;

public class Address 
{
public static String COUNTRY = "USA";
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Address()
	{
		
	}
	
	public Address(String street, String city, String state, String zip) 
	{
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	
	

}
