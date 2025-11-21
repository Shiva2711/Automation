package com.Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		
		String s = "Paragon";
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>(); 
		
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			
			if(m.getValue()==1) {
				System.out.println("First Unique Character: "+m.getKey());
				return;
			}
		}
		System.out.println("No Unique character is found");

	}

}
