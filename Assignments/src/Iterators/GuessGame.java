package Iterators;
import java.security.SecureRandom;
import java.util.Scanner;
public class GuessGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SecureRandom rand = new SecureRandom();
		int numGen = 1 + rand.nextInt(100);
		
		System.out.println("***************@@@@ WELCOME TO THE GUESS GAME @@@@*******************");
		System.out.print("****@@@@ THIS GAME IS VERY EASY AND USER FRIENDLY. ENJOY!!! @@@@****");
		System.out.println("\n");

		
		System.out.print("Guess a number less than or equal to 100 but more than or equal to 0: ");
		int guess = scan.nextInt();
		
		while(guess >= 0 && guess <= 100) {
			
			if (numGen > guess) {
				System.out.printf("Too low!, try again.You are very close.%n");
				System.out.print("Enter number less than or equal to 100 but more than or equal to 0: ");
				guess = scan.nextInt();
				
			}
			else if(numGen < guess) {
				System.out.printf("Too High!, try again. You are very close.%n");
				System.out.print("Enter number less than or equal to 100 but more than or equal to 0: ");
				guess = scan.nextInt();
				
			}
			
			else {
				System.out.printf("Yes! you win%n%n%n");
				 numGen = 1 + rand.nextInt(100);
				System.out.print("Enter new guess to start again or number greater than 100 to quit");
				guess = scan.nextInt();
			}
		}
		
		if(guess >100) {
			System.out.print("You quit too early, You are a COWARD!");
		}
		if(guess < 0) {
			System.out.print("You quit too early, You are a COWARD!");
		}

	}

}
