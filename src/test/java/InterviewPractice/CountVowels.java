package InterviewPractice;

import java.util.Arrays;

public class CountVowels {

	public static void main(String[] args) {
		
		String name = "SivaChandranR";
		
		String Vowels = "aeiouAEIOU";
		
		int count = 0;
		
		for(char c : name.toCharArray()) {
			
			if(Vowels.indexOf(c)!= -1) {
				
				count= count +1;
				
			}
		}
		
		System.out.println("Total Vowels count in the String is: "+count);

	}

}
