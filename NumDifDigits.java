import java.util.*;
import java.lang.*;

public class NumDifDigits {
	public static void main(String[] args) {
		int userEntry;
		Scanner scan = new Scanner (System.in);

		System.out.print("Please enter your 4-digit number: ");
		userEntry = scan.nextInt();

		String numStr = Integer.toString(userEntry);
		char arr[] = numStr.toCharArray();
		int count = numStr.length();

		for (int i=0;i < arr.length;i++) {
			if (i != numStr.indexOf(arr[i])) {
				count--;
			}
		}
		System.out.println("There are "+ count+ " different digits in a number "+userEntry);
		
	}

}
