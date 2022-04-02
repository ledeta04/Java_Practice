package com.day9.String;

public class StringIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Locate a substring within String - indexof

		String companyname = "craft software";

		System.out.println(companyname.indexOf("software")); // show starting index

		// To extract the word we use "substring" method

		System.out.println(companyname.substring(2)); // space also count index

		System.out.println(companyname.substring(2, 7)); // space also count index

	}

}
