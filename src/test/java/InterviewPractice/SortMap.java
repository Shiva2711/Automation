package InterviewPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 1);
		map.put(2, 1);
		map.put(4, 2);
		map.put(3, 4);
		map.put(5, 2);
		map.put(6, 8);
		map.put(7, 1);
		
		Map<Integer, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new));
		
		sortedMap.forEach((key, value)->System.out.println(key+"->"+value));
		System.out.println();

	}

}
