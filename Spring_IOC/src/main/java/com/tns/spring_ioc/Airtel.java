package com.tns.spring_ioc;

public class Airtel implements Sim
{
	public Airtel() 
	{
		super();
		System.out.println("Constructor-Airtel");
	}
	
	public void calling() 
	{
		System.out.println("Calling using Airtel Sim");	
	}

	public void data() 
	{
		System.out.println("Browsing using Airtel Sim");	
	}

}
