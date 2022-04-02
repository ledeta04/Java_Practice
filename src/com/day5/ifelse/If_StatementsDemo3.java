package com.day5.ifelse;


import java.util.Scanner;

public class If_StatementsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("pls enter your number; ");
		int value = in.nextInt();
		
		if(value %2!=0) {
			System.out.println("you entered odd number");
			
		}
		
		else {
			
			System.out.println("you entered even number");
		}

	}

}
