package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SecongHighestNumberInTheList {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,1,2,3,1,5,6,3,5,2);
		
		//System.out.println(numbers.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(1));
		
		Set<Integer> s = new TreeSet<>(numbers);
		
		List<Integer> NumbersSorted = new ArrayList<>(s);
		
		List<Integer> NumbersSortedReverse = NumbersSorted.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("Second largest number is the List: "+NumbersSortedReverse.get(1));
	}

}
