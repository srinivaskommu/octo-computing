package com.hotelmgmt.domain;

public class DataType 
{
	byte b;
	Byte b1;
	
	
	char c = 'a';
	Character c1;
	
	short s;
	Short s1;
	
	
	int i;
	Integer i1;
	
	long j;
	
	float k;
	double d;
	boolean isTrue;
	
	
	
	Integer iWrapper = 0;
	
	

	
 public String toString()
 {
	 return "byte = "+b+"	char ="+c+"short "+s+"int="+ i+"long  =  "+j+""+"float="+ k+"double"+ d+"boolean "+ isTrue+ "iWrapper"+iWrapper;
	 
 }

}
