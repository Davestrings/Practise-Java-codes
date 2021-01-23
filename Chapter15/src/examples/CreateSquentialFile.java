package examples;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateSquentialFile {
	private static ObjectOutputStream output;
	private static FileOutputStream fileOut;

	public static void main(String[] args) {
		openFile();
		addRecords();
		closeFile();

	}
	
	public static void openFile() {
		try {
			output = new ObjectOutputStream(Files.newOutputStream(Paths.get("create.ser")));
		}catch(IOException ioException) {
			System.err.println("Error opening file. Terminating...");
			System.exit(1);
		}
	}
	public static void addRecords() {
		Scanner input = new Scanner(System.in);
		System.out.printf("%s%n%s%n? ", 
				"Enter account number, first name, last name, balance",
				"Enter end-of-file indicator to end input");
		
		while(input.hasNext()) {
			try {
				Account record = new Account(input.nextInt(), input.next(), input.next(), input.nextDouble());
				output.writeObject(record);// writeObject ensures that object record implements interface serializable and writes the object to the output stream
			}catch(NoSuchElementException elementEx) {
				System.err.println("Invalid input. Please try again. ");
				input.nextLine();
			}catch(IOException ioEx) {
				ioEx.printStackTrace();
				System.err.println("Error writing to file. Terminating...");
				break;
			}
		}
	}
	
	public static void closeFile() {
		try {
			if(output != null)
				output.close();
		}catch(IOException ioEx) {
			System.err.println("Error closing file. Terminating...");
		}
	}

}
