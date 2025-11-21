package com.Practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
 
public class RemoveDuplicatesAndSort {

	public static void main(String[] args) {
		
		List<String> companies = Arrays.asList("HCL", "CTS", "MTech", "CTS");
		
		Set<String> uniqueSorted = new TreeSet<>(companies);
		
		//Optional
		List<String> result = new ArrayList<>(uniqueSorted);
		
		System.out.println("Oringinal List: "+companies);
		System.out.println("without Duplicates and sorted: "+uniqueSorted);


	}

}
