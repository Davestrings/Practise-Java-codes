import java.util.Scanner;
public class LargestNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number ");
		int firstNumber = input.nextInt();

		System.out.print("Enter the second number ");
		int secondNumber = input.nextInt();

		System.out.print("Enter the third number ");
		int thirdNumber = input.nextInt();

		int largest = 0;

		if(firstNumber > secondNumber){
			largest = firstNumber;
		}
		if (firstNumber > thirdNumber){
			largest = firstNumber;
		}
		if (secondNumber > firstNumber){
			largest = secondNumber;
		}
		if(secondNumber > thirdNumber){
			largest = secondNumber;
		}
		if(thirdNumber > firstNumber){
			largest = thirdNumber;
		}
		if(thirdNumber > secondNumber){
			largest = thirdNumber;
		}
		System.out.println("The Largest number is " + largest);
	}


}