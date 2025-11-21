package com.Practice;

class FibonacciExample1 {

	public static void main(String args[]) {
		
		int first = 0, second = 1, next;
		System.out.print(first + " " + second);// printing 0 and 1

		for (int i = 2; i < 10; i++)// loop starts from 2 because 0 and 1 are already printed
		{
			next = first + second;
			System.out.print(" " + next);
			first = second;
			second = next;
		}

	}
}