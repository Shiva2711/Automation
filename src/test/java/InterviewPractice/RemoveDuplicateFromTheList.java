package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;

public class RemoveDuplicateFromTheList {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(1,1,2,3,3,3,4,4,4,5,5);
				
		Set<Integer> unique = new TreeSet<>(number);
		
		ArrayList<Integer> DecendingUnique = new ArrayList<Integer>(unique);
		
		DecendingUnique.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.print(s+" "));	

	}

}
