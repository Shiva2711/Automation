package com.Practice;

class primeNumber {
	public static void main(String[] args) {
		
		String primeNumbers = "";  // Empty String

		for (int i = 200; i <= 400; i++) {
			int count = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				
				primeNumbers = primeNumbers + i + " ";  // Appended the Prime number to the String
			}
		}
		System.out.println("Prime numbers from 200 to 400 are :");
		System.out.println(primeNumbers);
	}
}