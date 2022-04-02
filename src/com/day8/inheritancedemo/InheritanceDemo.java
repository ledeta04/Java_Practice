package com.day8.inheritancedemo;

		// Single inheritance

class Calculation {  // Parent Class

	int z;

	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given numbers: " + z);
	}

	public void Subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers: " + z);
	}
}
class My_Calculation extends Calculation{ // Child Class
		int z;

		public void Multiplication(int x, int y) {
			z = x * y;
			System.out.println("The produce of the given number: " + z);
		}

}
public class InheritanceDemo{
	
		public static void main(String[] args) {
			
			My_Calculation calc = new My_Calculation(); //Object from Child
			
			calc.addition(10, 10);
			calc.Subtraction(20, 10);
			calc.Multiplication(10, 10);
			
		}

	}
