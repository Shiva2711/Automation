package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.ss.formula.functions.Count;

public class CountVowels2 {

	public static void main(String[] args) {
		
		String name = "SivaChandranR";
		
		String Vowels = "aeiouAEIOU";
		
		//long count = name.chars().mapToObj(c -> (char)c).filter(s->Vowels.indexOf(s)!=-1).count();
		
		long count = name.chars().filter(s->Vowels.indexOf(s)!=-1).count();
		System.out.println("Total Vowels count in the String is: "+count);
		
				
		


	}

}
