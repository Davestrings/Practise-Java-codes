package chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateNumber {
	private  ArrayList<Integer> myList = new ArrayList<Integer>();
	private Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		DuplicateNumber duplicate = new DuplicateNumber();
		duplicate.addNumber();
		
	}
	public void addNumber() {
		while(true) {
			System.out.print("Enter a number: ");
			int number = scan.nextInt();
			if(myList.contains(number)) {
				continue;
			}else {
				myList.add(number);
				for(int count = 0; count < myList.size(); count++)
					System.out.println(myList);// instead of passing the array to the print method, passing "myList.get(count) method will output the arraylist indexes.
				if(myList.size()== 5) {
					break;
				}
			}
				
		}
		scan.nextLine();
//		scan.close();
	}

}
