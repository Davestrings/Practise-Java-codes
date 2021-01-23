package accounts;
import java.util.Scanner;
import java.security.SecureRandom;;
public class CrapsGame {
	private static  enum Status{CONTINUE, LOST, WON};
	private static double balance;
	private static double wager;
	
	//constant variables
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int ELEVEN = 11;
	private static final int BOX_CAN = 12;
	
	//Scanner object
	private static final Scanner scan = new Scanner(System.in);
	//SecureRandom object
	private static final SecureRandom rand = new SecureRandom();

	public static void main(String[] args) {
		double myBalance = getBalance();
		double mywager = wager();
		int sumOfDice;
		int gamePoint = 0;
		if(myBalance >= mywager & mywager!= 0 ) {
			debit();
			sumOfDice = rollDice();
			Status gameStatus;
			
			switch(sumOfDice){
			case ELEVEN:
			case SEVEN:
				gameStatus = Status.WON;
				break;
			case SNAKE_EYES:
			case TREY:
			case BOX_CAN:
				gameStatus = Status.LOST;
				break;
			default:
				gameStatus = Status.CONTINUE;
				gamePoint = sumOfDice;
				System.out.printf("Your game point is %d%n", gamePoint);
			}
			
			//Use your game point to determine if you win the  game or not.
			while(gameStatus == Status.CONTINUE) {
				sumOfDice = rollDice();
				if(sumOfDice == gamePoint) {
					gameStatus = Status.WON;
				}else if(sumOfDice == SEVEN) {
					gameStatus = Status.LOST;
				}
			}
			
			if(gameStatus == Status.WON) {
				System.out.println(" You Win!");
				credit();
			}
			else
				System.out.println("You Loss\nTry Again Another Time");
		}else {
			System.out.println("Oops! Seems you need to fund your account.");
			System.out.print("Try again when you have sufficient credit.");
		}
		

	}
	
	
	public static double getBalance() {
		System.out.println("Enter your account balance: ");
		int myBalance = scan.nextInt();
		balance = myBalance;
		return balance;
	}
	public static double wager() {
		System.out.println("Enter your wager: ");
		int myWager = scan.nextInt();
		if(balance >= myWager) {
			wager = myWager;
		}else {
			wager = 0;
		}
		return wager;
	}
	public static void debit() {
		if(balance >= wager) {
			balance = balance - wager;
			System.out.printf("Your current balance is now %f%n:", balance);
		}
	}
	public static int rollDice() {
		int die1 = 1 + rand.nextInt(6);
		int die2 = 1 + rand.nextInt(6);
		int sum = die1 + die2;
		System.out.printf("You rolled die1: %d die2: %d and sum: %d%n", die1, die2, sum);
		return sum;
	}
	public static void credit() {
			balance = balance +(2* wager);
			System.out.print("Your current balance is now " + balance);
	}

}
