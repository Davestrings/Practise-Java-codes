package examples;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentialFile {
	
	private static ObjectInputStream input;
	public static void main(String[] args) {
		openfile();
		readRecords();
		closeFile();

	}
	public static void openfile() {
		try {
			input = new ObjectInputStream(Files.newInputStream(Paths.get("create.ser")));
		}catch(IOException ioEx) {
			System.err.println("Error opening file. Terminating...");
			System.exit(1);
		}
	}
	public static void readRecords() {
		System.out.printf("%-10s%-12s%-10s%10s%n", "Account", "First Name", "Last Name", "Balance");
		try {
			while(true) {
				Account record = (Account) input.readObject();
				
				System.out.printf("%-10d%-12s%-12s%10.2f%n", 
						record.getAccount(), record.getFirstName(), 
						record.getLastName(), record.getBalance());
			}
		}catch(EOFException eofEx) {
			System.out.println();
		}catch(ClassNotFoundException classEx) {
			System.err.println();
		}catch(IOException ioEx) {
			System.err.println();
		}	
	}
	public static void closeFile() {
		try {
			if(input != null)
				input.close();
		}catch(IOException ioEx) {
			System.err.println("Error closing file. Terminating...");
			System.exit(1);
		}
	}

}
