package carPractise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarFileTester {

	public static void main(String[] args) {
		CarRecords cars = new CarRecords();
		cars.readList();
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("%s%n%s%n","Press 1 - if you wish to add a single record",
				"Press 2 - if you wish to add multiple records");
		int anchorNum = scan.nextInt();
		try {
			if(anchorNum == 1) {
				System.out.printf("%s%n%s%n%s%n%s%n%s%n", "Press 1 - To add record to list.",
						"Press 2 - To remove file from list",
						"Press 3 - To write record to file",
						"Press 4 - To view all record",
						"Press 5 - To exit");
				int fNumber = scan.nextInt();
				while(fNumber != 5) {
					switch(fNumber) {
					case 1:
						cars.addCar();
						break;
					case 2:
						cars.removeCar();
						//does not remove record from file if already added. Adjust that!
						break;
					case 3:
						cars.writeList();
						break;
					case 4:
						cars.listAll();
						break;
					default:
						System.out.println("Please enter a number between 1 - 4");
					}
					System.out.println("Press 3 - To write record to file and Press 5 - To exit after writing to file");
					fNumber = scan.nextInt();
				}
			}else if(anchorNum == 2) {
				
				System.out.printf("%s%n%s%n%s%n%s%n%s%n", "Press 1 - To add record to list.",
						"Press 2 - To remove file from list",
						"Press 3 - To write record to file",
						"Press 4 - To view all record",
						"Press 5 - To exit");
				int fNumber = scan.nextInt();
				while(fNumber != 5) {
					switch(fNumber) {
					case 1:
						System.out.print("Enter number of car records you wish to enter: ");
						int number = scan.nextInt();
						int counter = 1;
						while(counter <= number) {
							cars.addCar();
							System.out.println("++++++++++++++++++++++++++++++++");
							counter++;
						}
						break;
					case 2:
						cars.removeCar();
						//does not remove record from file if already added. Adjust that!
						break;
					case 3:
						cars.writeList();
						break;
					case 4:
						cars.listAll();
						break;
					default:
						System.out.println("Please enter a number between 1 - 4");
					}
					System.out.println("Press 3 - To write record to file and Press 5 - To exit after writing to file");
					fNumber = scan.nextInt();
				}
			}
		}catch(InputMismatchException e) {
			e.getMessage();
			System.err.println("Invalid input...");
			
		}
		cars.writeList();//ensures that whatever operation carried out on the record is written to file 
		scan.close();
	}

}
