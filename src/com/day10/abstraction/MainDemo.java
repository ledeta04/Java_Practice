package com.day10.abstraction;

abstract class AbstractionDemo{
	
	abstract void callme();
	
	void callmetoo() {
		System.out.println("This is concrete method");
	}
}
class B extends AbstractionDemo{

	@Override
	void callme() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of callme by object B");
	}
}

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// B b = new B();
	//we can use abstract parent as reference but not for Object
		AbstractionDemo b = new B(); // upcasting 
		
		b.callme();
		b.callmetoo();
		
	}

}
