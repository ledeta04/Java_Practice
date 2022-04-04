package com.day11.collections;

import java.util.ArrayDeque;

public class Queue_DeQueArrayDequeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<String> a = new ArrayDeque();
		
	// to insert data we use add
		a.add("kebede");
		a.add("belete");
		a.add("chala");
		
	// if we have homogeneous list we use for loop	
		for(String b: a) {
			System.out.println(b);
		}

	}

}
