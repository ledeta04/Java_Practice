package com.day11.collections;

import java.util.LinkedList;

public class List_LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// if we have homogeneous LinkedList
//LinkedList is non synchronize 

		LinkedList<Integer> emp = new LinkedList();
	
// to insert data we use add	
		emp.add(1);
		emp.add(3);
		emp.add(5);
		
		emp.remove(0); // to remove
		
	// if we have homogeneous list we use for loop
		for(int a: emp) {
			System.out.println(a);
	}

	}

}
