package com.day8.StaticVariableDemo;

public class EmployeeInfo {
	
	static String myname = "Ashenafi Moges"; // static variable 
	static int age = 35;  // static variable 
	int salary = 160000;  // instance variable
	
	
	public static void getEmpDetails() { // static method
		System.out.println("Name: " + myname);
		System.out.println("Age: " + age);
	//	System.out.println("Salary " + salary); // we can not access if it is not static
	}
	
	public void printEmpDetails() {  // Concrete Method we can access all static or non static
		System.out.println("Name: " + myname);
		System.out.println("Age: " + age);
		System.out.println("Salary "+ salary); // we can access instance variable here
	}
	
	public static void main(String[]args) {
		
		EmployeeInfo.getEmpDetails(); // Static, We can access with out creating an Object
		
	//	EmployeeInfo.printEmpDetails(); // Not allowed 
		
		EmployeeInfo emp = new EmployeeInfo();
		emp.printEmpDetails();  // Allowed after creating an Object
		
	// static access only static variable and static method	
	}
	
	

	
}

