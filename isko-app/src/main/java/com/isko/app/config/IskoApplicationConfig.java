package com.isko.app.config;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.isko.app.domain.Student;

public class IskoApplicationConfig {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        if(student!=null)
        {
        	System.out.println("spring loaded student");
        }

	}

}
