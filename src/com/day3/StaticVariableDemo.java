package com.day3;

public class StaticVariableDemo {
	
	
		static double salary;  // Static Variable	
		static String dept = "Finance"; // Static Variable
		int age = 35; // instance variable
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			// we can access Static Variable without creating an Object or with an Object
			StaticVariableDemo.salary = 4000;
			StaticVariableDemo.dept = "Finance";
			
			System.out.println(StaticVariableDemo.salary);
			System.out.println(StaticVariableDemo.dept);
			
			// We can not access Instance Variable without creating an Object
			//StaticVariableDemo.age = 35; // It will give me an error
			
			StaticVariableDemo m1 = new StaticVariableDemo();
			
			m1.salary = 6000;
			m1.age = 36;
			
			System.out.println("Dept:" + dept);
			System.out.println("Salary:" + salary);
			System.out.println("age: " + m1.age);
		}
			
	}

	


