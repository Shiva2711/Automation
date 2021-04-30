package com.Practice.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashTable {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Hey");
		hm.put(2, "How");
		hm.put(3, "are");
		hm.put(4, "you");
		
		System.out.println(hm.get(3));
		hm.remove(3);
		System.out.println(hm.get(3));
		
		Set s = hm.entrySet();
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			//System.out.println(it.next());
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		

	}

}
