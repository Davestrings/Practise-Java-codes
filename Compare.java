import java.util.Scanner;

public class Compare{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int numA;
		int numB;
		System.out.println("Enter the first number");
		numA = scan.nextInt();
		
		System.out.println("Enter the second number");
		numB = scan.nextInt();

		if(numA > numB){
			System.out.println( numA + " is larger");
		}else System.out.println (numB + " is larger");
		
		if(numA == numB){
			System.out.println("These numbers are equal");
		}
	}
}