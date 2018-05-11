package com.java.talentech;

public abstract class AbstractClass {

	abstract public void myMethod(); {    //declare abstract method
		System.out.println("This is a abstract method");	
	}
	
	abstract int sum();   //declare abstract method
	
	public void myMethod1() { // declare non abstract method
System.out.println("This is method one");
}
}