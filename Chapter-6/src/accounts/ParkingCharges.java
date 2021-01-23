/**
 * 
 */
package accounts;

/**
 * @author USER
 *
 */
import java.util.Scanner;
public class ParkingCharges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of hours:  ");
		double hours = scan.nextDouble();
		
		System.out.printf("The number of hours spent is %.2f hours.%nYour bill is $%.2f%n", hours, calculateCharges(hours));

	}
	public static double calculateCharges(double hours) {
		double charges;
		if(hours == 3) {
			charges = 2;
		}else if(hours == 24) {
			charges = 10;
		}else {
			charges = 3 + (hours - 3) * 0.5;
		}
		
		return charges;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	}

}
