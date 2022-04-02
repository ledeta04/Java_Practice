package com.day9.String;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String Comparison! its comparing an Object one by one not the String

		String fullname = "abebe";
		String parentname = "abeba";
		String fullName = "abeba";

		System.out.println(fullname.equals(parentname)); //false

		System.out.println(parentname.equals(fullName)); //true

	}

}
