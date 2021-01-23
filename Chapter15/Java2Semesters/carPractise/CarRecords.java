package carPractise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.IllegalFormatConversionException;
import java.util.List;
import java.util.Scanner;

public class CarRecords {
	private List<Car> carList = new ArrayList<Car>();
	
	private static final Scanner scan = new Scanner(System.in);
	public void addCar() {
		
		String make;
		int regNum;
		double price;
		
		System.out.print("Enter car registration Number: ");
		regNum = scan.nextInt();
		System.out.print("Enter car maker: ");
		make = scan.next();
		System.out.print("Enter car price: ");
		price = scan.nextDouble();
		carList.add(new Car(regNum, make, price));
	}
	public void removeCar() {
		int regNum;
		
		System.out.print("Enter the registration number of the car you wish to remove: ");
		regNum = scan.nextInt();
//		String regNumS = regNum.toString();
		
		for(Car car : carList)
			if(car.getRegistrationNum() == regNum) {// concurrent modification error occurs here. Needs a fix
				carList.remove(car);
			}else {
				System.out.println("No match found.");
				}
	}
	public void listAll() {
		if(carList.isEmpty()) {
			System.out.println("No record found.");
		}else {
			for(Car car : carList) {
				System.out.printf(">>> %d %s %f%n", car.getRegistrationNum(), car.getMake(), car.getPrice());
			}
		}
	}
	public void writeList() {
		try(FileWriter carFile = new FileWriter("CarFile.txt");
			PrintWriter carFileDoc = new PrintWriter(carFile);
		){ 
			for(Car item : carList) { // each has it own individual line because readLine method that read these record reads 
									//a whole line which may result in error since other readers will return null. 
				carFileDoc.printf("%s%n", item.getRegistrationNum());
				carFileDoc.printf("%s%n", item.getMake());
				carFileDoc.printf("%.2f%n", item.getPrice());
			}
		}catch(IllegalFormatConversionException e) {
			System.out.println("Invalid input. Terminating...");
			System.exit(1);
		}catch(IOException ex) {
			System.err.println("Error writing to file. Terminating...");
			ex.getMessage();
			System.exit(1);
		}
	}
	public void readList() {
		int tempReg;
		String tempRegS;
		String tempMake;
		double tempPrice;
		String tempPriceS;
		try(//using try/resources ensures that file is automatically closed after use
				FileReader reader = new FileReader("CarFile.txt");
				BufferedReader carFileReader = new BufferedReader(reader);
				){

			tempRegS = carFileReader.readLine(); // read first line to assert it's not null
//			System.out.println(tempRegS);
			while(tempRegS != null) {
				tempReg = Integer.parseInt(tempRegS); // convert string to integer for output
				tempMake = carFileReader.readLine();
//				System.out.println(tempMake);
				tempPriceS = carFileReader.readLine();
//				System.out.println("p "+tempPriceS);
				tempPrice = Double.parseDouble(tempPriceS); // convert string to double
				carList.add(new Car(tempReg, tempMake, tempPrice));
				tempRegS = carFileReader.readLine();
			}
		}catch(FileNotFoundException e) {
			System.err.println("File not found... Terminating");
			System.exit(1);
		}catch(IOException ex) {
			System.err.println("Error reading file. Terminating...");
			System.exit(1);
		}
	}
	

}
