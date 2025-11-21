package com.Practice.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class mapp {

	public static void main(String[] args) {
		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "Vellore");
		mp.put(2, "Coimbatore");
		mp.put(3, "Chennai");

		Set s = mp.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Map.Entry map = (Map.Entry) it.next();
			System.out.println("Key: " +map.getKey() +" Value: "+map.getValue());
		}

	}

}
