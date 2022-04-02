package com.day3;

public class InstanceVariableDemo {

	int age = 25; // <----InstanceVariablea Declared outside methods

	public void methodone() {
		int i = 10; // local variable
		System.out.println("Value of i:" + i); //10
		System.out.println("Value of  age:" + age); //25
	}

	public void methodtwo() {
		int k = 30; // local variable
		System.out.println("Value of k:" + k); //30
		System.out.println("Value of  age:" + age); //25
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an object
		InstanceVariableDemo var = new InstanceVariableDemo();
		
		// we can override the age here
		// var.age = 40;
		var.methodone();
		var.methodtwo();
		
		// within one class we can create multiple Objects
		System.out.println();
		InstanceVariableDemo var1 = new InstanceVariableDemo();
		var1.methodone();
		
		//InstanceVariableDemo var2 = new InstanceVariableDemo();
		
		
	}

}
