package com.shweta.designpattern;

public class DemoSingleThread {

	public static void main(String[] args) {
		System.out.println("calling class");
		Singleton singleton = Singleton.getSingletonClasstInstance("First");
		Singleton singleton2ndCall = Singleton.getSingletonClasstInstance("2nd");
		System.out.println(singleton.value);
		System.out.println(singleton2ndCall.value);	
		

	}

}
