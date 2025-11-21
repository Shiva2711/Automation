package InterviewPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequencyOfEachElementInList {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,1,2,2,1,1,3,3,3);
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int number : numbers) {
			
			map.put(number, map.getOrDefault(number, 0)+1);
		}

		for(Map.Entry<Integer, Integer> mp: map.entrySet()) {
			
			System.out.println("Number: "+mp.getKey()+ " , Frequency Count:"+mp.getValue());
		}
	}

}
