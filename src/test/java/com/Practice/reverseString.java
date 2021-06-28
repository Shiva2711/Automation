package com.Practice;

public class reverseString {

	public static void main(String[] args) {
		
		String s = "sivachandran";
		
		
		String t ="";
		for(int i =s.length()-1; i>=0; i--) {
			
			String reverse = t + s.charAt(i);
			System.out.print(reverse);
			
		}
		
	}
	
}
