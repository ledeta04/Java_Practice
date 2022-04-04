package com.day11.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class List_VectorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//If we have mixed String and integer Vector
	//Vector is synchronize
	
			Vector emp = new Vector();
		
// to insert data we use add
			emp.add("abebe");
			emp.add(1);
			emp.add(true);
			emp.add("alemu");
			
	//we can not create an object with Iterator interface so we need class
		//	Iterator i = new Iterator();
			
			Iterator i = emp.iterator(); // create an Object
			
	// if we have mixed list we use while loop			
			while(i.hasNext()) {
				System.out.println(i.next());
			}

	}

}
