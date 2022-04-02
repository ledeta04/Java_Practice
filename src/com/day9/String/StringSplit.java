package com.day9.String;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String Split

		String companyName = "craft software technologies private limited company";

		// we have to use an Array first
		String[] splitcraft = companyName.split(" ");

		System.out.println(splitcraft[0]); // start from 0 index

		// If you want to print out all of them we use "for loop"

		for(int i = 0; i<splitcraft.length; i++) {

		System.out.println(splitcraft[i]);
		}

	}

}
