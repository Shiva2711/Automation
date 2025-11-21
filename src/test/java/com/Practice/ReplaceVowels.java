package com.Practice;

public class ReplaceVowels {

	public static void main(String[] args) {
		
		String input = "automation";
		String vowels = "aeiouAEIOU";
		
		StringBuilder result = new StringBuilder();
		
		int count = 0;
		
		for(char c : input.toCharArray()) {
			
			if(vowels.indexOf(c) != -1) {
				count ++;
				//result.append("&".repeat(count));
				for(int i=0; i<count; i++) {
					result.append("&");
				}
			}
			else {
				result.append(c);
			}
		}
		
		System.out.println("Original: "+input);
		System.out.println("Modified: "+result.toString());

	}

}
