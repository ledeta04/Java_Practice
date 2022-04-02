package com.day6.Array;

public class ArrayDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[]  studentMarks = {67,78.9,80,95.67,55,77,56};
		
		double sum=0;
		double average =0;
		
		//we will do it with for loop first
		
//		for(int i=0; i<studentMarks.length; i++) {
//			
//			sum = studentMarks[i] + sum;
//		}
//		average = sum/studentMarks.length; //we can write size 7 or length
//		
//		System.out.println("your mark sum is: " + sum);
//		System.out.println("your average is: " + average);
		
		
		// we will do it for each loop like this
		
		for(double stud: studentMarks) {
			sum = stud + sum;
			average = sum/studentMarks.length;
			
		}
		System.out.println("your mark sum is: " + sum);
		System.out.println("your average is: " + average);
	

	   }

	}
