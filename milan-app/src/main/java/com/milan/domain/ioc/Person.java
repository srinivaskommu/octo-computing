package com.milan.domain.ioc;

public class Person 
{
	

	private String name;
	private String ssn;
	private Address address;
	
	public Person(String name, String ssn, Address address) 
	{
		super();
		this.name = name;
		this.ssn = ssn;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public Address getAddress() {
		return address;
	}


}
