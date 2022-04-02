package com.day8.inheritancedemo;

class Animal2{
	
	Animal2(){ // Constructor using class name no using void for this
		System.out.println("From animal class");
	}
	
	void sound() {
		System.out.println("animal sound...");
	}
}
class Dog2 extends Animal2{
	
	Dog2(){ // Constructor using class name no using void for this
		super(); // call immediate parent in this case we dont need to use super
		System.out.println("From dog class");
	}
	
	@Override
	void sound() {
		System.out.println("bark bark....");
	}
	void display() {
		sound();
		super.sound(); // calling immediate parent method
	}
	
}

public class MethodOverriding4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog2 d = new Dog2();
		d.display();

	}

}
