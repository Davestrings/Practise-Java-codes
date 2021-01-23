import java.util.Scanner;
public class Mileage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner takeInput = new Scanner(System.in);
			
		int mileDriven = 0;
		int gallonUsed = 0;
		double mileage = 0;
		double totalMileage = 0;
		int tripCounter = 0;
		
		
		System.out.print("Enter miles in metre or -1 to quit: ");
		mileDriven = takeInput.nextInt();
		
		System.out.print("Enter fuel used in gallon: ");
		gallonUsed = takeInput.nextInt();
		
		
		while(mileDriven != -1) {
			mileage = (double) mileDriven / gallonUsed;
			totalMileage = totalMileage + mileage;
			++tripCounter;
			System.out.printf("%n%.4f mileage for trip %d%n", mileage, tripCounter );
			
			
			System.out.print("Enter miles in metre or -1 to quit: ");
			mileDriven = takeInput.nextInt();
			
			System.out.print("Enter fuel used in gallon: ");
			gallonUsed = takeInput.nextInt();
		}
		
		System.out.printf("Total mileage is %.4f", totalMileage);
	}

}
