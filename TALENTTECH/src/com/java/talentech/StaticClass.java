package com.java.talentech;

public class StaticClass {
	
int stat1=101;
public static int stat2=202;
	/*public static void main(String[] args) {
		StaticClass s = new StaticClass();
		s.method1();
		System.out.println("Accessing static data without any object:"+StaticClass.stat2);	
	}
	*/
	
	public void method1() {
System.out.println("printting non static data:"+stat1);
System.out.println("printting  static data:"+stat2);
}
	
	public static void method2() {
		//System.out.println("printing non static data:"+stat1);
		System.out.println("this is a static method");	
	}
}