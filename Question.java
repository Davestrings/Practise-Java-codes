import java.util. Scanner;


public class Question{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber = input.nextInt();
		System.out.println("Enter the second number");
		int secondNumber = input.nextInt();
		System.out.println("Enter thirdNumber");
		int thirdNumber = input.nextInt();

		int result1 = firstNumber + secondNumber;
		
		if(result1 > thirdNumber){
			System.out.printf("%d is greater than the third number",result1);
		}
		if(result1 < thirdNumber){
			System.out.printf("%d is greater than result",thirdNumber);
		}
		System.out.println();
		System.out.printf("The character %c %c %c %c %c %c %c %c %c %c %c %c %c has the value %d %d %d %d %d %d %d %d %d %d %d %d %d", 'A','B','C','a','b','c','0','1','2','$','*','+','/', ((int) 'A'),((int) 'B'),((int) 'C'),((int) 'a'),((int) 'b'),((int) 'c'),((int) '0'),((int) '1'),((int) '2'),((int) '$'),((int) '*'),((int) '+'), ((int) '/'));
	}
}