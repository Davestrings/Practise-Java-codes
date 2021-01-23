package file;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import Exercise.MenuOption;

public class CreditEnquiry {
	private MenuOption[] options = MenuOption.values();
	
	public MenuOption getRequest(){
        int choice = 4;
        System.out.printf("Enter requests%n%s%n%s%n%s%n%s%n",
                "1 : Lists all accounts with zero balance ",
                "2 : Lists all accounts with credit balance ",
                "3 : lists all accounts with debit balance ",
                "4 : End program");

       try {
    	   Scanner input = new Scanner(System.in);
           do {
           	System.out.print("? ");
           	choice = input.nextInt();
           }while(choice < 1 || choice > 4);
           
       }catch(InputMismatchException ex) {
    	   System.err.println("Invalid input.");
       }catch(NoSuchElementException ex) {
    	   System.err.println("No match. Enter valid input");
       }
        return options[choice - 1];
    }
	
	public static void readRecord(MenuOption accountType) {
		try(Scanner input = new Scanner(Paths.get("clients.txt"))){
			while(input.hasNext()) {
				
				int accountNum = input.nextInt();
				String fName = input.next();
				String lName = input.next();
				double balance = input.nextDouble();
				
				if(shouldDisplay(accountType, balance))
					System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNum, fName, lName, balance);
				else
					input.nextLine();
			}
		} catch (NoSuchElementException | IllegalArgumentException| IOException e) {
			System.out.println("Error Processing file. Terminating");
			System.exit(2);
//			e.printStackTrace();
		}
		
	}
	private static boolean shouldDisplay(MenuOption accountType, double balance) {
		if(accountType == MenuOption.CREDIT_BALANCE && balance < 0)
			return true;
		else if(accountType == MenuOption.DEBIT_BALANCE && balance > 0)
			return true;
		else if(accountType == MenuOption.ZERO_BALANCE && balance == 0)
			return true;
		
		return false;
	}
}
