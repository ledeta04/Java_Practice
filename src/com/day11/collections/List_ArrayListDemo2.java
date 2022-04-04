package com.day11.collections;

import java.util.ArrayList;

public class List_ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// if we have homogeneous ArrayList
//ArrayList is non synchronize		
		
		ArrayList<Integer> emp = new ArrayList();
	
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