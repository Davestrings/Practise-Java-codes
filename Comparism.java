import java.util.Scanner;

public class Comparism{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second number ");
		int secondNumber = input.nextInt();

		if(firstNumber > secondNumber){
			System.out.println("largest number is " + firstNumber);
		}else System.out.println("largest number is " + secondNumber);
	}
}