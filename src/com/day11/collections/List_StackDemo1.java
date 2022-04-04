package com.day11.collections;

import java.util.Iterator;
import java.util.Stack;

public class List_StackDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Stack is using LIFO(last in first out)
//we use method "push"	and "pop"
		
		Stack emp = new Stack();

// to insert data we use push	
		emp.push("Ashenafi");
		emp.push("Kedru");
		emp.push("Hana");
		emp.push("Sofia");
		
		emp.push(20);
		
	//	System.out.println(emp.pop());//"pop"it will take out the last in
		
		Iterator i = emp.iterator();

	// if we have mixed list we use while loop		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
