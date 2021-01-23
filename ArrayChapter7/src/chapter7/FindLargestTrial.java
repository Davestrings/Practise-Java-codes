package chapter7;
import java.util.Scanner;

public class FindLargestTrial {

	public static void main(String[] args) {
		Scanner dave = new Scanner( System.in);
		//collect input
		int firstNumber;
		int smallestNumber; //1
		
		System.out.print("Enter your first number: ");
		firstNumber = dave.nextInt();
		smallestNumber = firstNumber; //3
		
		int secondNumber;
		System.out.print("Enter your second number: ");
		secondNumber = dave.nextInt();
		
		if (smallestNumber > secondNumber) {
				 smallestNumber = secondNumber;
				}
		
		System.out.print("Enter your third number: ");
		int thirdNumber = dave.nextInt();
		
		if (smallestNumber > thirdNumber) {
			smallestNumber = thirdNumber;
		}
			
		System.out.printf("%d is the smallest number%n", smallestNumber);
				
		

	}

}
