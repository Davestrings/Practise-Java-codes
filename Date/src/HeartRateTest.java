import java.util.Scanner;
public class HeartRateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		HeartRate heartBeat = new HeartRate("Ojunde", "Dare", 12, 10, 1980);
		System.out.printf("%s %s is %dyrs old now %n",heartBeat.getLastName(), heartBeat.getFirstName(), heartBeat.displayAge());
		System.out.printf("His maximum heartrate is %d beats %n", heartBeat.getMaxHeartRate());
		System.out.printf("His target heart rate at is within the range %d - %d beats %n%n", heartBeat.targetHeartRate50(), heartBeat.targetHeartRate85());
		
		System.out.print("Enter Last Name: ");
		String lastName = input.nextLine();
		
		System.out.print("Enter First Name: ");
		String firstName = input.nextLine();
		
		System.out.print("Enter day of birth: ");
		int day = input.nextInt();
		
		System.out.print("Enter month of birth: ");
		int month = input.nextInt();
		
		System.out.print("Enter year of birth: ");
		int year = input.nextInt();
		
		HeartRate myHeartBeat = new HeartRate();
		myHeartBeat.setDay(day);
		myHeartBeat.setMonth(month);
		myHeartBeat.setYear(year);
		myHeartBeat.setLastName(lastName);
		myHeartBeat.setFirstName(firstName);
		
		System.out.println("\n");
		
		System.out.println(myHeartBeat.displayDOB());
		System.out.printf("You are %dyrs old.%n", myHeartBeat.displayAge());
		System.out.printf("Mr %s %s, your maximum heart rate is %d beats %n", myHeartBeat.getLastName(), myHeartBeat.getFirstName(), myHeartBeat.getMaxHeartRate());
		System.out.printf("Your target heart rate is within %d - %d beats %n", myHeartBeat.targetHeartRate50(), myHeartBeat.targetHeartRate85());
		
		//Alternative, constructor overloading using user input
		
		HeartRate  yourHeartBeat = new HeartRate(lastName, firstName, day, month, year);
		System.out.print(yourHeartBeat.getMaxHeartRate());
	}

}
