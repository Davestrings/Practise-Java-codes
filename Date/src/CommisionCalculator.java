import java.util.Scanner;
public class CommisionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner takeInput = new Scanner(System.in);
		
		double commission = 0;
		double itemSold = 0;
		double totalItemSold = 0;
		double item = 0;
		double quantity = 0;
		
		System.out.print("Enter price of item sold or -3 to quit: ");
		item = takeInput.nextDouble();
		
		System.out.print("Enter quantity bought: ");
		quantity = takeInput.nextDouble();
		
		while(item != -3) {
			itemSold = item * quantity;
			totalItemSold += itemSold; 
			
			System.out.print("Enter price of item sold or -3 to quit: ");
			item = takeInput.nextDouble();
			
			System.out.print("Enter quantity bought: ");
			quantity = takeInput.nextDouble();
			
		}
		
		commission = (0.09 * totalItemSold) + 200;
		System.out.printf("Your commission is $%.2f%n", commission);
	}

}
