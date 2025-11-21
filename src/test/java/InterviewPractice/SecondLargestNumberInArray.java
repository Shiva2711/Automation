package InterviewPractice;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		
		int numbers[] = {1,2,1,2,4,5};
		
		int FirstLargest = Integer.MIN_VALUE;
		int SecondLargest = Integer.MIN_VALUE;
		
		for(int number: numbers) {
			
			if(number>FirstLargest) {
				
				SecondLargest = FirstLargest;
				FirstLargest = number;				
			}
			
			else if(number>SecondLargest && number !=FirstLargest) {
				SecondLargest = number; 
			}
			
		}
		
		System.out.println("Second Largest: "+SecondLargest);


	}

}
