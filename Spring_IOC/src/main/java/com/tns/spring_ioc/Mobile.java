package com.tns.spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) 
	{
		/*Agenda-Spring IOC
		//1.We should not touch the source code
		//2.This application should be configurable
		//hard-coding*/
		
		/*
		//for Vi class methods
		Vi v= new Vi();
		v.calling();
		v.data();
		
		//for Jio class methods
		Jio j=new Jio();
		j.calling();
		j.data();
		*/
		
		@SuppressWarnings({ "resource", "unused" })
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Configuration loaded");
		
		/*//for vi class
		Vi v=(Vi)a.getBean("vi");
		v.calling();
		v.data();
		
		//for jio class
		Jio j=(Jio)a.getBean("jio");
		j.calling();
		j.data(); */
		
		Sim s=a.getBean("sim",Sim.class);
		s.calling();
		s.data();
	}

}