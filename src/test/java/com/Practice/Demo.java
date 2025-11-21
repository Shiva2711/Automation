package com.Practice;

import java.util.*;
import java.util.stream.*;

public class Demo {

	public static void main(String[] args) {

		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("s", 1);
		map.put("x", 4);
		map.put("d", 3);
		map.put("z", 2);
		
		Map<String, Integer> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)->e1 , LinkedHashMap::new));

		System.out.println(sorted);
	}
}
