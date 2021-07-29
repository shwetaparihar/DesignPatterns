package com.shweta.designpattern;

public class Singleton {
	public  String value;
	private  static Singleton instance;
	private Singleton(String valuepassed) {
		this.value = valuepassed;
	}

	static Singleton getSingletonClasstInstance(String valuepassed)
	{
		if(instance == null)
		 instance = new Singleton(valuepassed);
		 return instance;
	}
	
}

