package InterviewPractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReplaceStartingLetterOfWordToCaptital {

	public static void main(String[] args) {
		String str = "welcome to natwest";
		
		String result = Arrays.asList(str.split(" ") ).stream().map(s->s.substring(0, 1).toUpperCase()+s.substring(1)).collect(Collectors.joining(" "));
		
		System.out.println(result);
	}

}
