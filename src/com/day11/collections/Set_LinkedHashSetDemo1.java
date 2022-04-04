package com.day11.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_LinkedHashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// data is unique on all Set classes (no repetition)
// LinkedHashSet is faster than HashSet	
//If we have mixed String and integer

		LinkedHashSet a = new LinkedHashSet();

		// to insert data we use add
		a.add("Fasika");
		a.add("Belay");
		a.add("Harenet");
		a.add("Harenet");
		a.add(15);

		Iterator i = a.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
