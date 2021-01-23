package Iterators;
import java.util.Scanner;
public class NumberPyramid {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int numb = scan.nextInt();
		
		int count;
		int count2;
		int count3;
		
		for( count = 1; count<=numb; count++) {
			for( count2 = numb; count2 >=count; count2--) {
				System.out.print(" ");
			}
			for(count3 = 0; count3 <(2 * count)-1; count3++) {
				System.out.print(count);
			}
			System.out.println();
		}

	}

}
