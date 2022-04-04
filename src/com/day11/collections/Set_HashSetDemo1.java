package com.day11.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Set_HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// data is unique on all Set classes (no repetition)
//If we have mixed String and integer	
		
		HashSet a = new HashSet();
		
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
