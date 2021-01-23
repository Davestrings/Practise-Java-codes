import java.util.Scanner;
public class TwoLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int largest = 0;
		int counter = 1;
		int secondLargest = 0;
		int number;
		
		while(counter <= 10) {
			System.out.print("Enter number:");
			number = input.nextInt();
			
			if(number > largest) {
				secondLargest = largest;
				largest = number;
				
			}
			if(number > secondLargest)
				if(number < largest)
				secondLargest = number;
			
			++counter;
		}
		
		System.out.printf("%d is largest and %d second largest", largest, secondLargest);
	}

}
