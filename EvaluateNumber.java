//Execise 2.17

import java.util.Scanner;
public class EvaluateNumber{
	public static void main(String[] args){
		Scanner collect = new Scanner(System.in);

		int firstNumber;
		int secondNumber;
		int thirdNumber;

		int sum;
		int average;
		int product;

		System.out.print("Enter first number ");
		firstNumber = collect.nextInt();

		System.out.print("Enter second number ");
		secondNumber = collect.nextInt();

		System.out.print("Enter third number ");
		thirdNumber = collect.nextInt();

		sum = firstNumber + secondNumber + thirdNumber;
			System.out.println("Sum equal " + sum);
		average = sum/3;
			System.out.println("Average is " + average);
		product = firstNumber * secondNumber * thirdNumber;
			System.out.println("Product is " + product);

		if((secondNumber < firstNumber) && (firstNumber > thirdNumber)){
			System.out.println("Largest number is " + firstNumber);
		}else if((secondNumber > firstNumber) && (secondNumber > thirdNumber)){
			System.out.println("Largest number is " + secondNumber);
		}else System.out.println("Largest number is " + thirdNumber);

		if((firstNumber < secondNumber) && (firstNumber < thirdNumber)){
			System.out.println("Lowest number is " + firstNumber);
		}else if((secondNumber < firstNumber) && (secondNumber < thirdNumber)){
			System.out.println("Lowest number is " + secondNumber);
		}else System.out.println("Lowest number is " + thirdNumber);
	}
}