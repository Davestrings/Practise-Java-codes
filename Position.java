import java.util.Scanner;
public class Position{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number ");
		int firstNumber = input.nextInt();

		System.out.println("Enter the second number ");
		int secondNumber = input.nextInt();

		System.out.println("Enter the third number ");
		int thirdNumber = input.nextInt();

		int largest = 0;
		int position = 0;

		if(firstNumber > largest){
			largest = firstNumber;
			position = 1;
		}
		if(secondNumber > largest){
			largest = secondNumber;
			position = 2;
		}
		if(thirdNumber > largest){
			largest = thirdNumber;
			position = 3;
		}

		System.out.printf("largest number is %d%n and position is %d ", largest, position);
	}
}