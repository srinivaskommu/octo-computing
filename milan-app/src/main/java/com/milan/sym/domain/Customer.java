package com.milan.sym.domain;

public class Customer 
{
	private String name;
	private String isAMember;
	public String getIsAMember() {
		return isAMember;
	}
	public void setIsAMember(String isAMember) {
		this.isAMember = isAMember;
	}
	private String memberType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	


}
