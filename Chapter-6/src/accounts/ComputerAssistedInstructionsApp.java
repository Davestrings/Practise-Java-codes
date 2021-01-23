package accounts;
import java.util.Scanner;
import java.security.SecureRandom;
public class ComputerAssistedInstructionsApp {
	//generated numbers
	private static int number1;
	private static int number2;
	private static int answer;
	private static short passCounter = 0;
	private static short failCounter = 0;

	//Scanner and SecureRandom objects
	private static Scanner scan = new Scanner(System.in);
	private static SecureRandom random = new SecureRandom();
	public static void main(String[] args) {
		//Game starts
		System.out.print("Enter number 1 to start: ");
		scan.nextInt();
		
		//system generate numbers
		randomNumber();
		randomNumber2();
		
		display(); // system display number
		
		System.out.println("Enter your answer: "); //user input answer
		answer = scan.nextInt();
		
		while(answer != -1) {
			
			int product = number1 * number2;
			
			while (answer != product) {
				encourage();
				displayInput();
				failCounter++;
			}
			
			if(answer == product) {
				positiveRemarks();
				passCounter++;
			}
			
			randomNumber();
			randomNumber2();
			display();
			System.out.println();
			System.out.println("Wanna continue? if \"No\" press -1 to quit.");
			System.out.println();
			displayInput();
		}
		numberOfRightAnswers();
		numberOfWrongAnswers();

	}
	//first random number
	public static int randomNumber() {
		number1 =1 + random.nextInt(10);
		return number1;
	}
	//second randomNumber
	public static int randomNumber2() {
		number2 = 1 + random.nextInt(10);
		return number2;
	}
	//display numbers to pupil
	public static void display() {
		System.out.printf("How much is %d times %d%n",number1,  number2);
		
	}
	public static int displayInput() {			//collect user inputs
		System.out.println("Enter your answer: ");
		answer = scan.nextInt();
		return answer;
	}
	public static void positiveRemarks() {			//give remark
		int remark = 1 + random.nextInt(5);
		switch(remark) {
		case 1:
			System.out.println("Yes! you did it");
			break;
		case 2:
			System.out.println("Very Good!");
			break;
		case 3:
			System.out.println("Excellent!");
			break;
		case 4:
			System.out.println("Nice work");
			break;
		case 5:
			System.out.println("Keep up the good work!");
			break;
			}
		}
		public static void encourage() {				//give remark
			int remark = 1 + random.nextInt(5);
			switch(remark) {
			case 1:
				System.out.println("No, please try again");
				break;
			case 2:
				System.out.println("Wrong please try once more");
				break;
			case 3:
				System.out.println("Don't give up!");
				break;
			case 4:
				System.out.println("No, Keep trying");
				break;
			case 5:
				System.out.println("You can do better");
				break;
			}
	} 
	
		public static void numberOfRightAnswers() {				//percentage of right answers
			int sum = passCounter + failCounter;
			float percentage = Math.round((passCounter * 100)/ sum);
			System.out.println("Your percentage success is %" + percentage);
			if(percentage >= 75) {
				System.out.println("Congratulations! You are ready to go to the next level.");
			}
		}
		
		public static void numberOfWrongAnswers() {				//percentage of wrong answers
			int sum = passCounter + failCounter;
			float percentage = Math.round((failCounter * 100)/ sum);
			System.out.println("Your percentage failure is %" + percentage);
		}

}
