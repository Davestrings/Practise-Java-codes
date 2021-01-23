package examples;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestingException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator\r and denominator");
		int num = scan.nextInt();
		int denomin = scan.nextInt();
		try {
			double nin = remainder(num,denomin);
			System.out.println(nin);
		} catch (ExceptionSuperClass| InputMismatchException e) {
			System.out.println("%nCannot divide by zero");
			System.err.println( e.getMessage());
//			e.printStackTrace();
//		}catch(Exception mismatch) {
//			System.out.println(mismatch.getMessage());
		}
		scan.nextLine();
		scan.nextLine();
		System.out.println("Enter a string");
		String numi = scan.nextLine();
		try {
			convertToIntValue(numi);
		} catch (ExceptionSuperClass e) {
			System.out.println("Enter numbers ");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		scan.close();
	}
	public static double remainder(int number, int denominator) throws ExceptionC {
		if(denominator == 0)
			throw new ExceptionC("please enter a non zero number");
		return number%denominator;
	}
	public static void convertToIntValue(String num) throws ExceptionB{
		ArrayList<String> numString = new ArrayList();
		numString.add("0"); 
		numString.add("1"); 
		numString.add("2");  
		numString.add("3");  
		numString.add("4");
		numString.add("5");  
		numString.add("6");  
		numString.add("7");  
		numString.add("8");  
		numString.add("9");
			int newInt =0;
		for(int i = 0; i< num.length(); i++) {
		if(!numString.contains(num.valueOf(i))) {
			throw new ExceptionB("Not a Number");
			}else {
				newInt = Integer.parseInt(num);
			}
		}
//		newInt = Integer.parseInt(num);
		System.out.println(newInt);
		
	}
}
