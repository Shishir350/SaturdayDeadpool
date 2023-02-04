package com.upskill.java_6;

public class singleton {
	
	//singleton is class that can have only one object 
	
	//private constructor, it prevents any other class from instantiatings
	private singleton () {
		
		
	}

	private singleton singletonObj = new singleton();
	
	public static singleton getInstance() {
		return singletonObj;
		
	
	}
	
	protected static void demo () {
		System.out.println ("Singleton Demo Method");
		
	}
	
}
