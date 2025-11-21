package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		
		String a;
		System.out.print(" Enter First String: ");
		Scanner sc1 = new Scanner(System.in);
		a = sc1.nextLine();
		String b;
		System.out.print(" Enter Second String: ");
		Scanner sc2 = new Scanner(System.in);
		b = sc2.nextLine();
		
		
		/*if(a.length()!=b.length()) {
			System.out.print("It is not a Anagram");
		}*/
		
		char i[] = a.toCharArray();
		char j[] = b.toCharArray();
		Arrays.sort(i);
		Arrays.sort(j);
		if(Arrays.equals(i,j)) {
			System.out.println("It is a Anagram");

		}
		else {
			System.out.println("It is not a Anagram");

		}
		
		

	}

}
