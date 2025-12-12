package InterviewPractice;

import java.util.Arrays;

public class ShiftZeroToRight {

	public static void main(String[] args) {
		int numbers[] = { 1, 0, 2, 3, 1, 2, 0, 1, 0 };

		int index = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] != 0) {
				numbers[index++] = numbers[i];
			}
		}

		while (index < numbers.length) {
			numbers[index++] = 0;

		}
		
		System.out.println(Arrays.toString(numbers));

	}

}
