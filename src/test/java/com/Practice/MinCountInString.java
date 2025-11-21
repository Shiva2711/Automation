package com.Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MinCountInString {

	public static void main(String[] args) {
		
		String s = "Happy Memories";
		String str = s.replaceAll(" ", "").toLowerCase();
		
		Map<Character, Integer> m = new LinkedHashMap<>();
		
		for(char c: str.toCharArray()) {
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		
		int min = m.get(str.charAt(0));
		
		for(int count : m.values()) {
			
			if(count<min) {
				min = count;
			}
			
		}
		
		System.out.print("Minimum characters that occurs "+min+" times:");
		for(Map.Entry<Character, Integer> mp : m.entrySet()) {
			
			if(mp.getValue() == min) {
				System.out.print(" "+mp.getKey());
			}
			
		}

	}

}
