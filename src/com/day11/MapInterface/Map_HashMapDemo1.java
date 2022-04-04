package com.day11.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap emp = new HashMap();
		
	//to insert data we use put
		emp.put("name", "Ashenafi");
		emp.put("age", 23);
		emp.put("salary", 5000);
		
	//	emp.remove("salary"); // to remove data
		
//if we use iterator we have to convert to Set first
		Set s = emp.entrySet();	
		
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			/*
			 * Converting back to Map.Entry so that we can get key and value separately
			 */
			Map.Entry e = (Map.Entry)i.next();//Casting
			
		//	System.out.println(e.getKey());
			System.out.println(e.getKey()+ " " + e.getValue());
			
		}

	}

}
