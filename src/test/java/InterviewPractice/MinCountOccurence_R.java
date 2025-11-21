package InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class MinCountOccurence_R {

	public static void main(String[] args) {
		
		String s = "SivachandranR";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : s.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		//System.out.println(s.toLowerCase().charAt(0));
		int mincount = map.get(s.toLowerCase().charAt(0));
		
		for(int count : map.values()) {
			
			if(count<mincount) {
				mincount = count;
			}
		}
		
		System.out.print("Min count that occurs "+mincount+" times in a String: ");
		for(Map.Entry<Character, Integer> mp : map.entrySet()) {
			
			if(mp.getValue() == mincount) {
				System.out.print(mp.getKey()+" ");
			}
		}

	}

}
