package InterviewPractice;

import java.util.Arrays;

public class ShiftZeroToLeft {

	public static void main(String[] args) {
		int numbers[] = { 1, 0, 2, 3, 1, 2, 0, 1, 0 };

		int index = numbers.length-1;

		for (int i = numbers.length-1; i>=0; i--) {

			if (numbers[i] != 0) {
				numbers[index--] = numbers[i];
			}
		}

		while (index >=0) {
			numbers[index--] = 0;

		}
		
		System.out.println(Arrays.toString(numbers));

	}

}
