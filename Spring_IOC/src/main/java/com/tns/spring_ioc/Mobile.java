package com.tns.spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile{

	public static void main(String[] args) 
	{
		/*Agenda-Spring IOC
		//1.We should not touch the source code
		//2.This application should be configurable
		//hard-coding*/
		
		/*
		// for Airtel class methods
		Airtel a= new Airtel();
		a.calling();
		a.data();
		
		// for Jio class methods
		Jio j=new Jio();
		j.calling();
		j.data();
		*/
		
		@SuppressWarnings("resource")
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Configuration loaded");
		
		/*
		 * //for vi class
		Airtel a=(Airtel)a.getBean("airtel");
		a.calling();
		a.data();
		
		// For Jio class
		Jio j=(Jio)a.getBean("jio");
		j.calling();
		j.data(); */
		
		Sim s=ac.getBean("sim",Sim.class);
		s.calling();
		s.data();
	
	}

}