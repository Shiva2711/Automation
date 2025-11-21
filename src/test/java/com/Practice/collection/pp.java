package com.Practice.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class pp {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 1, 3, 4 ,3 ,4 ,5};
		
		int length = a.length;
		
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		
		int i =0;
		
		while(i!=length) {
			if(mp.containsKey(a[i])== false) {
				mp.put(a[i], 1);
			}
			else {
				int oldvalue = mp.get(a[i]);
				int newvalue = oldvalue + 1;
				mp.put(a[i], newvalue);
			}
			i++;
		}
		
		Set s = mp.entrySet();
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
		Map.Entry m =	(Map.Entry)it.next();
		if(m.getValue().equals(1)) {
			System.out.println(m.getKey() +":" +m.getValue());
		}
		}
		
		

	}

}
