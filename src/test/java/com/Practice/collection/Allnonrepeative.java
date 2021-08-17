package com.Practice.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Allnonrepeative {

	public static void main(String[] args) {
		
		
		String s = "Java J2EE Java JSP J2EE";
		char[] arr = s.toCharArray();
		int length = arr.length;
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		int i =0;
		
		while(i!= length)
		{
			if(map.containsKey(arr[i]) == false) {
				map.put(arr[i], 1);
			}
			
			else {
				int oldvalue =map.get(arr[i]);
				int newvalue =  oldvalue +1;
				map.put(arr[i], newvalue);
			}
			
			
			i++;
		}
		
		Set set =map.entrySet();
		Iterator it =set.iterator();
		
		while(it.hasNext()) {
			Map.Entry mp =(Map.Entry)it.next();
			if(!mp.getValue().equals(1)) {
				System.out.println(mp.getKey()+ ":" +mp.getValue());
				//System.exit(0);
			}
		}
	}	
}
