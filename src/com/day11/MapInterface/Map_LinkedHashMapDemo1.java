package com.day11.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map_LinkedHashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// All Map are the same but structure is different behind the scene 

		LinkedHashMap customer = new LinkedHashMap();

		// to insert data we use put
		customer.put("name", "kebede");
		customer.put("address", "usa");
		customer.put("age", 44);

//if we use iterator we have to convert to Set first
		Set s = customer.entrySet();

		Iterator i = s.iterator();

		while (i.hasNext()) {
			/*
			 * Converting back to Map.Entry so that we can get key and value separately
			 */
			Map.Entry entry = (Map.Entry) i.next();

			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}