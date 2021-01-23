//Exercise 2.24
import java.util. Scanner;


public class Largest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int fN;
		int sN;
		int tN;
		int FN;
		int fFN;
		int largest;
		int smallest;

		System.out.print("Enter First number: ");
		fN = scan.nextInt();

		System.out.print("Enter Second number: ");
		sN = scan.nextInt();

		System.out.print("Enter third number: ");
		tN = scan.nextInt();
		
		System.out.print("Enter fourth number: ");
		FN = scan.nextInt();

		System.out.print("Enter fifth number: ");
		fFN = scan.nextInt();

		largest = fN;
		smallest = fN;

//Evaluating for the largest number
		if(sN > fN){
			largest = sN;
		}	
	
		if(tN > largest){
			largest = tN;
		}

		if(FN > largest){
			largest = FN;
		}
	
		if(fFN > largest){
			largest = fFN;
		}

		System.out.printf("%d is the largest", largest);

//Evaluating for Smallest number

		if(sN < fN){
			smallest = sN;
		}
		
		if(tN < smallest){
			smallest = tN;
		}

		if(FN < smallest){
			smallest = FN;
		}

		if(fFN < smallest){
			smallest = fFN;
		}
		System.out.println();
		System.out.printf("%d is the smallest", smallest);

	}	
}