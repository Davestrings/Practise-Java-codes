package accounts;
import  java.util.Scanner;
public class BinaryHexConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number you wish to convert: ");
		int number = scan.nextInt();
		
		System.out.printf("Your number is the reversed form %d%n",reverse(number));
		binary(number);
		octal(number);
		hexadecimal(number);

		scan.close();
	}
	public static int reverse(int number) {
		int remainder = 0;
		int reverse = 0;
		for(int i = number; number!=0; number/=10 ) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
		}
		//System.out.print(reverse);
		return reverse;
	}
	public static long reverse(long number) {
		long remainder = 0;
		long reverse = 0;
		for(long i = number; number!=0; number/=10 ) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
		}
		//System.out.print(reverse);
		return reverse;
	}
	public static long binary(int number) {
		int num = 0;
		long num1 = 0;
		long binary = 0;
		for(int i = number; number!=0; number/=2) {
			num = number % 2;
			num1= num1 *10 + num;
		}
		//System.out.println(num1);
		binary =reverse(num1); 
		System.out.println("Binary conversion of your number is " + " " + binary);
		return binary;
	}
	public static int octal(int number) {
		int num = 0;
		int num1 = 0;
		int octal = 0;
		for(int i = number; number!=0; number/=8) {
			num = number % 8;
			num1 = num1 * 10 + num;
		}
		//System.out.println(num1);
		octal = reverse(num1);
		System.out.printf("Octal conversion of your number is %d%n", octal);
		return octal;
	}
	public static String hexadecimal(int number) {
		int num = 0;
//		int num1 = 0;
		String hexadecimal = "";
		char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		for(int i = number; number!=0; number/=16) {
			num = number % 16;
			
//			switch(num) {
//			case 10:
//				num ='A';
//				break;
//			case 11:
//				num ='B';
//				break;
//			case 12:
//				num = 'C';
//				break;
//			case 13:
//				num = 'D';
//				break;
//			case 14:
//				num = 'E';
//				break;
//			case 15:
//				num = 'F';
//				break;
//				
//			}
			hexadecimal = hex[num] + hexadecimal; 
//			hexadecimal = num + hexadecimal; 
		}
		System.out.printf("Hexadecimal conversion of your number is %s ",hexadecimal);
		return hexadecimal;
	}
}	
