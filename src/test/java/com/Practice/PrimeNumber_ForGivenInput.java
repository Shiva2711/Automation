package com.Practice;

import java.util.Scanner;

public class PrimeNumber_ForGivenInput {

	public static void main(String[] args) {
		
		int number;
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		int count = 0;
					
			for(int i=number; i>=1; i--) {
				
				if(number%i == 0) {
					count++;
				}
			}
		
		if(count == 2 ) {
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number is not prime");
		}
	}
}
