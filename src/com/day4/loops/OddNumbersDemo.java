package com.day4.loops;

public class OddNumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// write a program that will print odd numbers from 1 to 10
		
		// If there is any remainder we call it Odd number
		
//		for (int i=1; i<=10; i++) {
//			
//			if(i%2!=0)  // We can say not equal to zero or remainder 1 as below example
//				
//				System.out.print(i + " ");
//		}

	for (int i=1; i<=10; i++) {
			
			if(i%2==1)
				
				System.out.print(i + " ");
		}
		
	}

}
