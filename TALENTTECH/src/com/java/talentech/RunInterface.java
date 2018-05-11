package com.java.talentech;

public class RunInterface {

	public static void main(String[] args) {
		MyInterface my = new AccessInterface();
		my.msg();
		int val=my.sum();
		System.out.println("sum output 1:"+val);
		int val2=my.sum(36,36);
		System.out.println("sum output 2:"+val2);
		int val3=MyInterface.sum(1, 2, 3);
		System.out.println("sum output 3:"+val3);

		
	}

}
