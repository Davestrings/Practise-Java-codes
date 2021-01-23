package examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroException {
	public static int quotient(int numerator, int denominator) throws ArithmeticException {
		return numerator / denominator;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean continueloop = true;
		
		do {
			try {
				System.out.print("Please enter the numerator: ");
				int numerator = scan.nextInt();
				System.out.println("please enter the denominator: ");
				int denominator = scan.nextInt();
				
				int result = quotient(numerator, denominator);
				System.out.println("result is :" + result);
				continueloop = false;
				}catch(InputMismatchException exception) {
					System.err.printf("%n Exception : %s%n", exception);
					scan.nextLine();
					System.out.printf("you must enter Integers. Please try again%n%n");
				}catch(ArithmeticException arith) {
					//System.err.printf("%n Exception : %s%n", arith);
					System.out.printf("Zero is an invaid denominator. PLEASE TRY AGAIN%n%n");
				}
			
			System.out.println("to determine blah blaah blaah"); //to show that the program continue to run after the exception has been handled
		}while(continueloop);
		scan.close();
	}

}
