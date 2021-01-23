import java.util.Scanner;

public class SeparateDigit{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a five digit number");
		int example = input.nextInt();
		
		if(example/10000 == 0){
			System.out.println("The number you entered is less than five digits. Please Enter a five digit number");
		}
		if(example/100000 != 0){
			System.out.println("The number you entered is more than five digits. Please Enter a five digit number");
		}
		if(example/10000 >= 1){
			int A = example/10000;
			int B = (example%10000)/1000;
			int C = (example%1000)/100;
			int D = (example%100)/10;
			int E = (example%10)/1;	
			System.out.printf("%d   %d   %d   %d   %d", A,   B,   C,   D,   E);
		} 
		
	}
}