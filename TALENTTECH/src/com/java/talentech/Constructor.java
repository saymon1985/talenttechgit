package com.java.talentech;

public class Constructor {
	public Constructor(){
		System.out.println("Default constructor is called");
		this.a=99;
		b=13;
	}
	public Constructor(int a,int c) {
		this.a=a;
		this.c=c;
		System.out.println("value of a:"+this.a);
		System.out.println("value of c:"+this .c);
	}
	
	public int a;
	private int b;
	public int c;
	

}
