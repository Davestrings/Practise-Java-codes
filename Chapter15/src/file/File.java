package file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class File {
	private static Formatter output;
	
	public static void main(String[] args) {
		openFile();
		writeInFile();
		output.close();
	}
	
	public static void openFile() {
		try {
			output = new Formatter("clients.txt");
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(1);
		}
	}
	public static void writeInFile() {
		Scanner  input = new Scanner(System.in);
		System.out.printf("%s%n%s%n? ", "Enter accout info. account number, first name, last name and balance ",
				"Enter end of file maker to terminate");
		while(input.hasNext()) {
			try {
				output.format("%d %s %s %.2f", input.nextInt(), input.next(), input.next(), input.nextDouble());
			}catch(FormatterClosedException | NoSuchElementException ex) {
				System.out.println("Error writting to file");
				System.exit(2);
			}
			System.out.println("? ");
		}
	
	}
}
