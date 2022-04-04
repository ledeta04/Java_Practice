package com.day11.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Set_TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// data is unique on all Set classes (no repetition)
//TreeSet does not allow the insertion of heterogeneous objects
//TreeSet sort out ascending order		
		
		TreeSet a = new TreeSet();

	// to insert data we use add
		a.add("Fasika");
		a.add("Belay");
		a.add("Harenet");
		a.add("Harenet");
		

		Iterator i = a.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
