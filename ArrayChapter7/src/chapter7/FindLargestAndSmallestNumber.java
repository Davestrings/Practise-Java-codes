package chapter7;

import java.util.Scanner;

public class FindLargestAndSmallestNumber {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);// creating scanner object
		int largest; // initializing largest and smallest variables
		int smallest;
		
		System.out.print("Enter your first number: ");
		int firstNumber = scan.nextInt(); // collect input
		
		largest = firstNumber;
		smallest = firstNumber;
		
		//collect second number
		System.out.print("Enter your second number: ");
		int secondNumber = scan.nextInt(); // collect input
		
		if(secondNumber > largest) {
			largest = secondNumber; // save secondNumber inside largest and throw whatever was previouly inside largest away
		}
		if(secondNumber < smallest) {
			smallest = secondNumber;
		}
		
		//collect third number
		System.out.print("Enter your third number: ");
		int thirdNumber = scan.nextInt();
		
		if(thirdNumber > largest) {
			largest = thirdNumber;
		}
		if(thirdNumber < smallest) {
			smallest = thirdNumber;
		}
		
		System.out.println(smallest + " is the smallest");
		System.out.print(largest + " is the largest");
	}
}
