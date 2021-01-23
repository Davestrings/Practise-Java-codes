package chapter14;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CompareStringPortion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word to compare");
		String temp = scan.nextLine();
		System.out.println("Enter 2nd word to compare");
		String temp2 = scan.nextLine();
		
		boolean tempCompare = temp.toLowerCase().regionMatches(1, temp2.toLowerCase(), 0, 4);
		if(tempCompare) {
			System.out.printf("%s is eqaul to from index 1  %s%n", temp, temp2);
		}else {
			System.out.printf("%s is not eqaul to from index 1  %s%n", temp, temp2);
		}
		int count = 1;
		while(true) {
			try {
				System.out.println("Enter a word to compare");
				temp = scan.nextLine();
				System.out.println("Enter 2nd word to compare");
				temp2 = scan.nextLine();
				tempCompare = temp.regionMatches(true, 1, temp2, 1, 4);
			}catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
			}
			
			
			if(tempCompare) {
				System.out.printf("%s is eqaul to from index 1  %s%n", temp, temp2);
			}else {
				System.out.printf("%s is not eqaul to from index 1  %s%n", temp, temp2);
			}
			count++;
			
			if(count == 5)
				break;
		}
		scan.close();
	}

}
