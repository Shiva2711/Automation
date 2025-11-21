package com.Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxCountInStrings {

	public static void main(String[] args) {
		
		String str = "Happy Memories";
		
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		
		for(char c : str.toLowerCase().toCharArray()) {
			
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		
		
		int maxcount = 0;
		
		for(int count : m.values()) {
			
			if(count>maxcount) {
				maxcount = count;
			}
		}
		
		System.out.print("Maximum characters that accours "+maxcount+" times:");
		for(Map.Entry<Character, Integer>mp : m.entrySet()) {
			
			if(mp.getValue() == maxcount) {
				
				System.out.print(" "+mp.getKey());
				
			}
			
		}
		
	}

}
