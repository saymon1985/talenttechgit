package com.java.talentech;

public class Animal {
	public Animal() {
		System.out.println("Parent class");
	}
	public Animal(int abc, int xyz) {
		this.a=abc;
		this.b=xyz;
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
String color;
int legs;
int eyes=2;
int a;
int b;
private static int pvt=13;



public void sound() {
	System.out.println("Animal can make sounds");	
}
public void run() {
System.out.println("Animal can run");
}
public void getData() {
	System.out.println("This is a animal's private data:"+pvt);
}
public void setData (int newPvtData) {
	this.pvt=newPvtData;
}	

}
