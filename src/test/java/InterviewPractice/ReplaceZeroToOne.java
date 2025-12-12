package InterviewPractice;

public class ReplaceZeroToOne {

	public static void main(String[] args) {

		int numbers[] = {10, 100, 21, 45, 65};
		
		String n[] = new String[numbers.length];
		
		for(int i=0; i<numbers.length; i++) {
			
			String s = String.valueOf(numbers[i]);
			
			StringBuffer temp = new StringBuffer();
			
			for(char c : s.toCharArray()) {
				
				if(c == '0') {
					temp.append('1');
				}
				else if(c == '1') {
					temp.append('0');
				}
				else {
					temp.append(c);
				}
			}
			
			n[i] = temp.toString();
			
			numbers[i] = Integer.parseInt(temp.toString());
			
		}
		
		for(int number: numbers) {
			System.out.print(number+" ");
		}
		
		System.out.println();
		
		for(String str : n) {
			System.out.print(str+" ");
		}
	}

}
