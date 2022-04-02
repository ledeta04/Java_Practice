package com.day6.Array;

public class ArrayDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[]  studentMarks = {67,78.9,80,95.67,55,77,56};
		
		calcStudMark(studentMarks);
		
	}
	private static void calcStudMark(double[] marks) { //we don't need to create an object cuz it's static
		
		double sum=0;
		double avg;
		
		for(int i=0; i<marks.length; i++) {
			sum = sum+marks[i];
		}
		avg = sum/marks.length;
		
		System.out.println("Total mark of sutdent: " + sum);
		System.out.println("Average mark of sutdent: " + avg);
		
	}
	    // for each loop creating method
//	for(double elt: marks) {
//		sum = sum + elt;
//	}
//	   avg = sum/marks.length;
	
}
