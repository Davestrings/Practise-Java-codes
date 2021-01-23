import java.util.Scanner;

public class Small_Large{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);

		System.out.print("enter the first number ");
		int num1 = input.nextInt();

		System.out.print("enter second number ");
		int num2 = input.nextInt();

		System.out.print("enter third number ");
		int num3 = input.nextInt();

		int sum = num1 + num2 + num3;
		int average = sum/3;
		int product = num1 * num2 * num3;


		int largest = num1;
		int smallest = num1;
		if(num2 > largest){
			largest = num2;
		}
		if (num3 > largest){
			largest = num3;
		}
		
		if(num2 < smallest){
			smallest = num2;
		}
		if(num3 < smallest){
			smallest = num3;
		}
		

		System.out.println("The sum of the numbers is " + sum);
		System.out.println("The Average of the numbers is " + average);
		System.out.println("The Product is " + product);
		System.out.println();
		System.out.println("The smallest number is " + smallest);
		System.out. println("The largest number is " + largest);
	}
}