package com.day11.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class List_LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// LinkedList is faster than LinkedList
//LinkedList is non synchronize 		
		
	LinkedList emp = new LinkedList();

// to insert data we use add
		emp.add("abebe");
		emp.add(1);
		emp.add(true);
		emp.add("alemu");
		
		Iterator i = emp.iterator();
		
	// if we have mixed list we use while loop	
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
