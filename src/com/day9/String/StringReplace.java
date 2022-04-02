package com.day9.String;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String Replace we use method "replace('a', 'e') a replace e

		String fullname = "abeba";

		// to replace single character we use replace

		System.out.println(fullname.replace('a', 'e'));

		// to replace multiple string or substring we use replaceAll

		System.out.println(fullname.replaceAll("abe", "kbe"));

	}

}
