package com.day8.inheritancedemo;

class GrandParent{
	
	void fun() {
		System.out.println("From GrandParent");
	}
}
class Parent extends GrandParent{
	
	void fun() {
		super.fun(); // to print GrandParent we have to use Super here
		System.out.println("From Parent");
	}
}
class Child extends Parent{
	
	void fun() {
		super.fun(); // to print Parent we have to use Super here
		System.out.println("From Child");
	}
}

public class InheritanceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
		c.fun();

	}

}
