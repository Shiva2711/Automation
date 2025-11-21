package InterviewPractice;

public class SwapToString {

	public static void main(String[] args) {
		
		String a = "Wipro";
		String b = "Bangalore";
		
		System.out.println("Before Swaping a="+a+" b="+b);

		a = a+b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		
		System.out.println("After Swaping a="+a+" b="+b);
		

	}

}
