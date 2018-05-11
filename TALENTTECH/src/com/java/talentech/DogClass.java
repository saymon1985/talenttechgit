package com.java.talentech;

public class DogClass extends Animal{
	
	public DogClass(){
		super(500,600);
		System.out.println("This is Child Class");
}
	public static void main(String[] args) {
		DogClass d = new DogClass();
		d.color="Purple";
		System.out.println(d.color);
		d.legs=4;
		System.out.println(d.legs);
		d.sound();
		d.run();
		d.numberOfEyes();
	}
		
		void numberOfEyes() {
		System.out.println(super.eyes);
			
	}
		public void sound() {
			System.out.println("Dog can sound ruff ruff");
		}			

}
