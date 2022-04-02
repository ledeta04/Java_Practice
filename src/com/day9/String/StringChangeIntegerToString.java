package com.day9.String;

public class StringChangeIntegerToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// How to change integer to string use method...toString

		double a = 251;

		String b = "+" + (Double.toString(a)); // concat "+" before integer

		System.out.println(b);

		// How to change string to integer use method...parseInt

		String c = "251";

		int d = Integer.parseInt(c);

		System.out.println(d);


	}

}
