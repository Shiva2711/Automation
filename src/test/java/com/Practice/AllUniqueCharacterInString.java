package com.Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class AllUniqueCharacterInString {

	public static void main(String[] args) {
		
		String s = "Paragon";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		boolean found = false;
		System.out.print("Unique character: ");
		
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			
			if(m.getValue()==1) {
				
				System.out.print(m.getKey()+ " ");
				found = true;
			}
		}
		
		if(!found) {
			System.out.print("None");
		}

	}

}
