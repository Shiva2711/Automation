package InterviewPractice;

public class RemoveSpaceFromWord {

	public static void main(String[] args) {
		//Without using replace all and for loop
		String s = "Welcome to Natwest";
		
		String result = s.join("", s.split(" "));
		System.out.println(result);
	}

}
