package com.day11.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_PriorityQueueDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue a = new PriorityQueue();
		
	// to insert data we use add
		a.add("David");
		a.add("Fasika");
		a.add("Belay");
		a.add("Harenet");
		
	//	a.poll(); // we use poll to remove the priority list
		
//		Iterator i = a.iterator();
//		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		System.out.println(a.peek()); // priority Queue first Object(Belay)
		System.out.println(a.element());// Priority Queue element
		
	}

}
