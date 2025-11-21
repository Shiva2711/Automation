package InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class MaxcountOccurance_R {

	public static void main(String[] args) {
		
		String s = "SivachandranR";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : s.toCharArray()) {
			
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		int maxcount = 0;
		
		for(int count: map.values()) {
			
			if(count>maxcount) {
				maxcount = count;
			}
		}
		
		System.out.print("Max count that occurs "+maxcount+" times in the string: ");
		for(Map.Entry<Character, Integer> mp : map.entrySet()) {
			
			if(mp.getValue() == maxcount) {
				System.out.println(mp.getKey() + " ");
			}
		}

	}

}
