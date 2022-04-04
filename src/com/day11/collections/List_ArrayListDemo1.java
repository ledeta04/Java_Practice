package com.day11.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class List_ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//If we have mixed String and integer ArrayList
	//ArrayList is non synchronize
//all List classes(Array, Linked, Vector, Stack) are data reputation 	
		
		ArrayList emp = new ArrayList();
		
	// to insert data we use add		
		emp.add("abebe");
		emp.add(1);
		emp.add(true);
		emp.add("alemu");
		emp.add("abebe");
		
//we can not create an object with Iterator interface so we need class
	//	Iterator i = new Iterator();
		
		Iterator i = emp.iterator(); // create an Object
		
		// if we have mixed list we use while loop	
		while(i.hasNext()) {   // .hasNext
			System.out.println(i.next()); // print out .next
		}

	}

}