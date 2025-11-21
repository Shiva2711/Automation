package InterviewPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterEvenInTheList {

	public static void main(String[] args) {
	
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> evennumbers = numbers.stream().filter(s-> s%2==0).collect(Collectors.toList());
		
		evennumbers.forEach(s->System.out.print(s + " "));

	}

}
