package InterviewPractice;

public abstract class ReverseDataofWordInSentence {
	
	public static void main(String args[]) {
		
		String s = "Welcome to India!, Nice to hav@ you back";
		
		StringBuffer result = new StringBuffer();
		
		String str[] = s.split(" ");
		
		for(String c: str) {
			
			if(c.matches("[A-Za-z0-9]+")) {
				
				String t ="";
				for(int i = c.length()-1; i>=0; i--) {
					t=t+ c.charAt(i);
				}
				result.append(t+" ");
			}
			else {
				result.append(c+ " ");
			}
		}
		
		System.out.println("Input: "+s);
		System.out.println("Output: "+result);

	}

}
