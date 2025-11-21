package makemyTrip;

import br.com.objectos.core.Strings;

public class emptyString {

	public static void main(String[] args) {
		
		String a[] = {"", "hello", " "};

		int Count = 0;
		for(int i=0; i<=a.length-1; i++) {
		if (Strings.isNullOrEmpty(a[i]) || a[i].length()<=1 ) {
		}
		else {
			System.out.println(a[i]);
			Count++;
		} 

	}
		System.out.println("Count: " +Count);
	}

}