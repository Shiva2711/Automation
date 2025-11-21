package com.Practice;

import java.util.*;
import java.util.stream.Collectors;


public class SecondHighestOccurance {

	public static void main(String[] args) {
		
		int numbers[] = {1,1,1,4,4,4,5,5,5,6,6,6,6,7,7,7,7,7};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int number : numbers) {
			
			map.put(number, map.getOrDefault(number, 0)+1);
		}
		
		Set<Integer> s = new TreeSet<Integer>(map.values());
		//List<Integer> l = new ArrayList<Integer>(s);
		
		int secondLargest = s.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(1);
				
		//int secondLargest = l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(1);
		
		System.out.print("Second Largest occurence number in the array that occures "+secondLargest+" times: ");
		for(Map.Entry<Integer, Integer> mp: map.entrySet() ) {
			
			if(mp.getValue() == secondLargest) {
				System.out.print(mp.getKey());
			}
 		}
	}

}
