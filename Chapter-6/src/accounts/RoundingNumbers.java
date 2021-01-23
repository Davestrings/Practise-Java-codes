package accounts;

import java.util.Scanner;
public class RoundingNumbers {

	private static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print(roundInteger(value()));
		System.out.print(roundUp(value()));
		
		
	}
	public static double value() {
		System.out.print("Enter number to covnert: ");
		double value = input.nextDouble();
		return value;
	} 
	public static int roundInteger(double value) {
		int number =  (int) Math.floor(value + 0.5);
		return number;
	}
	public static double roundUp( double value) {
		System.out.print("Enter 1 to round up to 10th, 2 for  100th and 3 for 1000th: ");
		int task = input.nextInt();
		double number;
		if(task == 1) {
			number = Math.floor(value * 10 + 0.5)/ 10;
		}else if (task == 2) {
			number = Math.floor(value * 100 + 0.5)/ 100;
		}else {
			number = Math.floor(value * 1000 + 0.5)/ 1000;
		}
		return number;
	}
	
}
