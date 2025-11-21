package InterviewPractice;

public class AscendingOrderOfString {

	public static void main(String[] args) {
		
		String s = "Welcome to India";
		
		char str[] = s.toLowerCase().toCharArray();
		char temp;
		
		for(int i=0; i<str.length-1;i++) {
			for(int j=0; j<str.length-1-i;j++) {
				if(str[j]>str[j+1]) {
					temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}
			}
		}
		
		System.out.println(str);

	}

}
