package com.day10.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int a 10; // compile time error missing = 
		
		int a = 20;
		int b = 0;
		
		try {  // we put suspect exception in here...try
		int c = a/b;  // dividing by zero an error
		}
		catch(ArithmeticException e) { // we catch it here...catch
			System.out.println(e); // if u want to see what was the issue e. then choose
		}
		System.out.println("after exception");

	}

}
