package com.day11.collections;

import java.util.Stack;

public class List_StackDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Stack is using LIFO(last in first out)
// if we have homogeneous Stack
//we use method "push"	and "pop"	
		
		Stack<String> emp = new Stack();
	
// to insert data we use push	
		emp.push("Ashenafi");
		emp.push("Kedru");
		emp.push("Hana");
		emp.push("Sofia");
		
		for(String a: emp) {
			System.out.println(a);
		}

	}

}
