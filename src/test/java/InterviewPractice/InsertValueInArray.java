package InterviewPractice;

public class InsertValueInArray {

	public static void main(String[] args) {
		int arr[] = {1,2,4,5,6};
		
		int index = 2;
		int value = 3;
		
		int newarr[] = new int[arr.length+1];
		
		for(int i=0, j=0; i<newarr.length; i++) {
			
			if(i == index) {
				newarr[i] = value;
			}
			else {
				newarr[i] = arr[j++];			
			}
		}
		
		for(int r : newarr) {
			System.out.print(r+" ");
		}

	}

}
