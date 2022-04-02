package com.day8.inheritancedemo;

class Animal1{
	String color = "White";
}
class Dog extends Animal1{
	
	String color = "Black";
	
	void display() {
		System.out.println("color: " + color);//Black
		System.out.println("color: " + super.color);//white(super call immediate parent)
	}
}

public class MethodOVerriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.display();

	}

}
