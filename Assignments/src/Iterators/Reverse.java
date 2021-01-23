package Iterators;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a five digit number: ");
		int remainder;
		int reverse = 0;
		
		for(int value = scan.nextInt(); value!=0; value/=10) {
			remainder = value%10;
			reverse = reverse * 10 + remainder; 
		}
		System.out.print(reverse);
	}

}
