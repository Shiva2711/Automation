package com.Practice.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueNumber {

	public static void main(String[] args) {
		
		int[] numbers = {1,1,2,2,3,4,5};
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int number : numbers) {
			
			map.put(number, map.getOrDefault(number, 0)+1);
		}
		
		System.out.println("Unique Number: ");
		boolean found = false;
		
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			
			if(m.getValue() == 1) {
				System.out.print(m.getKey() + " ");
				found = true;
			}
		}
		
		if(!found) {
			System.out.print("None");
		}

	}

}
