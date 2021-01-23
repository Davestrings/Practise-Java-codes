package Iterators;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		
		int counter = 1;
		int product ;
		
		do {
			product = counter * num;
			System.out.printf("%d x %d = %d%n", num, counter, product);
			counter++;
		}while(counter <= 12);

	}

}
