package com.day11.collections;

import java.util.LinkedHashSet;

public class Set_LinkedHashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// if we have homogeneous data
	// data is unique on all Set classes (no repetition)

		LinkedHashSet<String> a = new LinkedHashSet();

		// to insert data we use add
		a.add("Fasika");
		a.add("Belay");
		a.add("Harenet");
		a.add("Harenet");

		a.remove("Fasika"); // to remove
		
	// if we have homogeneous list we use for loop
		for(String b: a) {
			System.out.println(b);
		}

	}

}
