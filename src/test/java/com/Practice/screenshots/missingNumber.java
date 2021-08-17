package com.Practice.screenshots;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class missingNumber {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 5, 7};
		
		int n = a.length;
		
		int m = n+1;
		
		int total = (m*(m+1))/2;
		
		int sum =	Arrays.stream(a).sum();
		
		int missingNumber = total-sum;
 		System.out.println("Missing Number: "  + missingNumber);
		

	}
}
