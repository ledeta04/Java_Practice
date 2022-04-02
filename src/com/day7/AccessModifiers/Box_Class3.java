package com.day7.AccessModifiers;


public class Box_Class3 {

	
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
		
		Box_Class3 b = new Box_Class3();  // create an Object
		b.age = 41;
		b.salary = 7500;

	}

}
