package com.day7.Classes;

public class Box_Class {
	
	
	int age;     //instance variable or field
	int salary;  //instance variable or field
	
	public void printAge() {     // method
		
		System.out.println(age);
		
	}
	public void printSalary() {    //method
		
		System.out.println(salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box_Class b = new Box_Class();  // create an Object
		b.age = 41;
		b.salary = 7500;
		b.printAge();    // call method
		b.printSalary(); //call method
		
		com.day7.AccessModifiers.Box_Class3 k = new com.day7.AccessModifiers.Box_Class3();
	}

}
