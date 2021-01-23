package Iterators;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int sum = 0;
		do {
			System.out.printf("Enter first number: %n");
			num1 = scan.nextInt();
			System.out.printf("Enter second number: %n");
			num2 = scan.nextInt();
			sum = num1 + num2;
			System.out.println(sum);
			System.out.printf("Enter -1 to quit or 1 to continue : ");
			num3 = scan.nextInt();
			if(num3 == -1) {
				sum = num1 + num2;
				System.out.println("Goodbye");
			}else {
				
				System.out.println("Continue");
			}
			
		}while(num3 != -1);
	}

}
