package com.day2;

import java.util.Scanner;

public class EmployeeInfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("pls enter your name: ");
		String empName = input .next();
		
		System.out.println("pls enter your age: ");
		int empAge = input .nextInt();
		
		System.out.println("pls enter your Salary: ");
		double empSalary = input.nextDouble();
		
		System.out.println("pls enter your Bonus: ");
		double empBonus = input.nextDouble();
		
		System.out.println();
		
		System.out.println("pls enter the emp gender");
		char empGender = 'M';
		
//		String str=input.next();
//	    char ch=str.charAt(0);
		
		double totalSalary = empSalary + empBonus;
		
		System.out.println("Employee full name: " + empName);
		System.out.println("Employee Age: " + empAge);
		System.out.println("Employee Salary: " + empSalary);
		System.out.println("Employee Bonus: " + empBonus);
		System.out.println("Employee Gender: " + empGender);
		System.out.println("Employee Total Salary: " + totalSalary);
		
		
	}

}
