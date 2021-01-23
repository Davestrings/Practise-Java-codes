package Exercise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class OutputRecord {

	private static Formatter output , output2;
	private static Scanner scan = new Scanner(System.in);
	private static TransactionRecord transaction = new TransactionRecord();
	
	public static void main(String[] args) {
		createFile();
		addTransactionRecord();
		readRecord();
	}
	
	public static void createFile() {
		try {
			output = new Formatter("Trans.txt");
			output2 = new Formatter("Oldmast.txt");
		} catch (FileNotFoundException e) {
			System.err.println("Error opening file. Terminating...");
			System.exit(1);
		}catch(SecurityException secEx) {
			System.err.println("Write permission denied. Terminating...");
			System.exit(1);
		}
	}
	
	public static void addTransactionRecord() {
		System.out.printf("%s%n%s%n?", "Enter customer Account Number for today's transaction",
				"Enter Amount paid");
		
			try {
				while(scan.hasNext()) {
					 transaction = new TransactionRecord(scan.nextInt(), scan.nextDouble());
//					transaction.setAccountNumber(scan.nextInt()); transaction.setAmount(scan.nextDouble());
					int j = transaction.getAccountNumber();
					double m = transaction.getAmount();
				
					output.format("%d %f%n", j, m);
				
					System.out.println(j +" "+ m);
					System.out.print("? ");
				}
			}catch(FormatterClosedException ex) {
				System.err.println("Error writing to file. Terminating...");
				System.exit(1);
			}catch(NoSuchElementException elEx) {
				System.err.println("Invalid input.");
				scan.nextLine();
			}
		
		System.out.println(transaction.getAccountNumber());
		System.out.println(transaction.getAmount());
		
	}
	public static void readRecord() {
		Scanner input = null;
		try {
			input = new Scanner(Paths.get("Trans.txt"));
		} catch (IOException e) {
			System.err.println("Error reading from file. Terminating.");
			System.exit(1);
			e.printStackTrace();
		}
		
		while(input.hasNext()) {
			System.out.printf("%d %f", input.nextInt(), input.nextDouble());
		}
	}

}
