package com.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.Practice.collection.hasSet;

public class SecondLargest {

	public static void main(String[] args) {
		
		int numbers[] = {1,1,3,3,2,2,4,4,4,5,5,5,5};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int number : numbers) {
			
			map.put(number, map.getOrDefault(number, 0)+1);
		}
		
		Set<Integer> s = new HashSet<Integer>(map.values()); //Added Set to remove duplicates
		
		ArrayList<Integer> a = new ArrayList<>(s);
				
		List<Integer> numValues = a.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		int secondLargest = numValues.get(1);
		
		System.out.print("Second Largest number that occurs "+secondLargest+" times: ");

		for(Map.Entry<Integer, Integer> mp:  map.entrySet()) {
			
			if(mp.getValue()== secondLargest) {
				System.out.println(mp.getKey());
			}
		}
	}

}
