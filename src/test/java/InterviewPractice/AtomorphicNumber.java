package InterviewPractice;

import java.util.*;

public class AtomorphicNumber {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		int SquareOfNumber = number * number;
		System.out.println("Squares of Number: "+SquareOfNumber);
		String result = String.valueOf(SquareOfNumber);
		
		
		if(result.endsWith(String.valueOf(number))) {
			System.out.println("It is a Atomorphic Number");
		}
		else {
			System.out.println("It is not Atomorphic Number");
		}
		

	}

}
