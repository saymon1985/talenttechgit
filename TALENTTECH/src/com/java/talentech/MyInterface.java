package com.java.talentech;

public interface MyInterface {
	int num1=10;
	int num2=20;
	public void msg();
	public int sum();
	public int sum(int a, int  b);
	public static int sum(int a, int b, int c) {
		int num = a+b+c;
		return num;
		
}
}