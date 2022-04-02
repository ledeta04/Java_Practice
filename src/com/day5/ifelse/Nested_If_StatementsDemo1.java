package com.day5.ifelse;

public class Nested_If_StatementsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 25;
		int weight = 55;
		
		if (age>=18) {
			
			if (weight>50) { // nested if statements
				
			System.out.println("You are eligible");
			
			}
			
		}
		
		else {
			System.out.println("You are not eligible");
		}

	}

}
