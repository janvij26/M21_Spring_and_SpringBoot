package com.tns.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam  {

	public static void main(String[] args) 
	{
		/*
		Student s=new Student();
		s.setStudentName("Janvi Jambhale");
		s.display();
		*/
		
		@SuppressWarnings("resource")
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("File is executing...");
		//Student s=a.getBean("s1",Student.class);
		Student s1=a.getBean("s2",Student.class);
		//s.display();
		s1.display();
		
	}
		
}