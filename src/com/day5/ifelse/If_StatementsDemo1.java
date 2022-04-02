package com.day5.ifelse;


import java.util.Scanner;

public class If_StatementsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("pls enter your mark: ");
		double mark = in.nextDouble();
		
		
		if(mark >65) {
			
			System.out.println("First Division");
		}
		
		else {
			
			System.out.println("Second Division");
		}
		
		

	}

}
