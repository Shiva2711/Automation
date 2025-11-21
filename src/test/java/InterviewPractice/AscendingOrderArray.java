package InterviewPractice;

public class AscendingOrderArray {

	public static void main(String[] args) {
		int numbers[] = {1,2,5,1,3,2};
		
		int temp = 0;
		
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=0; j<numbers.length-1-i;j++) {
				if(numbers[j]>numbers[j+1]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		
		for(int number : numbers) {
			System.out.println(number);
		}
	}

}
