import java.util.Scanner;


public class CarPooling{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Estimate total miles you drive everyday ");
		double totalMiles = input.nextDouble();

		System.out.print("Enter cost of gasoline per litre in Naira  ");
		int gasolineCostPerLitre = input.nextInt();

		System.out.print("Estimate average miles travelled per litre of gasoline ");
		double averageMilesPerLitre = input.nextDouble();

		System.out.print("Enter daily parking fee in Naira ");
		int parkingFee = input.nextInt();

		System.out.print("Enter dialy toll fee ");
		int tollFee = input.nextInt();

		System.out.print("Input monthly cash income ");
		int cashIncome = input.nextInt();



//Arithmetics



		double costOfDrivingDaily = ((totalMiles * gasolineCostPerLitre) / averageMilesPerLitre) + parkingFee + tollFee;

		double costOfDrivingMonthly = costOfDrivingDaily * 30; 


		double incomeSpentOnDrivingMonthly = (costOfDrivingMonthly/cashIncome) * 100; 




//Result


		System.out.println("\n");
		System.out.println("Your estimated cost of driving daily is  " + costOfDrivingDaily + "Naira");

		System.out.println("This is the amount you spend on driving monthly " + costOfDrivingMonthly + "Naira");

		System.out.println("This means you spend " + incomeSpentOnDrivingMonthly + "% " +"of your salary on driving daily.");
	}
}