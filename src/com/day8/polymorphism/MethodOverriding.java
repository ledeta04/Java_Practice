package com.day8.polymorphism;
	
	// Method Overriding
class Animal{
	void eat() {
		System.out.println("Animal eating ....");
		
	}
}
class Dog extends Animal{
	
	@Override // optional to write this
	void eat() {  // Method name has to be same as Parent Method
		System.out.println("Dog eating....");
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.eat();

	}

}
