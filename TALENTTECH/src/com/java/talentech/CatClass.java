package com.java.talentech;

public class CatClass extends Animal {
	

	public CatClass(){
		super();
		System.out.println("This is Cat class");
	}
	public static void main(String[]args) {
		CatClass c = new CatClass();
		Animal Cat = new CatClass();
		Animal tom = new CatClass();
		
		c.sound();
		c.run();
		Cat.sound();
		Cat.setData(1300);
		Cat.getData();
		tom.getData();
		tom.setData(2300);
		Cat.getData();
		
			
	}
	public void sound() {
		System.out.println("Cat can mew mew sound");
		Animal cat = new CatClass();
	
	}			
}
