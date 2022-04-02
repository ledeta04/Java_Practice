package com.day9.String;

public class StringContainOnlyDidit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Check if a String contain only digit

		String phonenumber = "566785A56";

		char ch; // we create a variable

		for(int i = 0; i<phonenumber.length(); i++) {

		ch = phonenumber.charAt(i);

		System.out.println(ch);

		if(Character.isDigit(ch)) {  // we have to write Character.isDigit
		continue;  //System.out.println("It is Digit"); we can write like this too
		}
		else {
		System.out.println("String contain non Digit");
		}
		}

	}

}
