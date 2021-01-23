import java.util.Scanner;
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner takeInput = new Scanner(System.in);
		
		Date today = new Date(21, 12, 2019);
		
		System.out.print("Enter day: ");
		int day = takeInput.nextInt();
		
		System.out.print("Enter month: ");
		int month = takeInput.nextInt();
		
		System.out.print("Enter year: ");
		int year = takeInput.nextInt();
		
		System.out.print(today.displayDate(day, month, year));
	}

}
