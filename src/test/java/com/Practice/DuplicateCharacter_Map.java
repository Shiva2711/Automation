package com.Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharacter_Map {

	public static void main(String[] args) {
		String str = "All things bright and beautiful";
		
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		
		for(char c : str.replaceAll(" ", "").toCharArray()) {
			
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		
		Boolean b = false; 
		
		System.out.print("Duplicate Characters in the Strings: ");
		for(Map.Entry<Character, Integer> mp : m.entrySet()) {
			
			if(mp.getValue()>1) {
				System.out.print(" "+mp.getKey());
			}
			b=true;
		}
		
		if(!b) {
			System.out.println("None");
		}

	}

}
