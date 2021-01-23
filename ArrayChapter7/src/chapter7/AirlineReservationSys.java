package chapter7;

import java.util.Scanner;

public class AirlineReservationSys {
	private FlightClass flightClass;
	private boolean[] seats = new boolean[11];
	private int passengerSeat;
	
	private static final Scanner scan = new Scanner(System.in);
	public AirlineReservationSys() {
		
	}
	public void seatNumber() {
		System.out.println("Enter between 1 - 5 for first class\n6 - 10 for economy class");
		int seatNumber = scan.nextInt();
		setFlightClass(seatNumber);
		passengerSeat = seatNumber;
	}
	private void updatePassengerSeat(int seatNum) {
		passengerSeat = seatNum;
		System.out.println(passengerSeat);
	}
	public int getSeatNumber() {
//		System.out.println(passengerSeat);
		return passengerSeat;
	}
	
	private void updateSeat(int seatNumber) {
		seats[seatNumber] = true;
	}
	public void setFlightClass(int seatNumber) {
		
		if(seatNumber > 0 && seatNumber <= 5) {
			boolean isAvailable = isFirstClassSeatAvailable(seatNumber);
			if(isAvailable) {
				flightClass = FlightClass.FIRST_CLASS;
				updateSeat(seatNumber);
			}else{
				System.out.println("Seat not available \nWould you like another seat assigned to you in economy?");
				System.out.println("if \"Yes\" enter 1, if \"No\" enter 2");
//				scan.nextLine();
				int alternative = scan.nextInt();
				// if 2 was typed then it should move to the else statement
				if(alternative == 1) {
					for(int i = 5; i< seats.length; i++) {
						System.out.println("testing");
						System.out.println(seats[i]);
						isAvailable = seats[i];
						if(!isAvailable) {
							flightClass = FlightClass.ECONOMY;
							updateSeat(seatNumber);
							updatePassengerSeat(i);
							System.out.println(seats[i]);
							System.out.println(passengerSeat);
							System.out.println("seat " + getSeatNumber());
							break;// Once a seat is found stop the loop
						}else {
							System.out.println("Sorry, no seat available");
						}
					}
				}
			}//end of inner else
			
			
		}else if(seatNumber > 5 && seatNumber <= 10) {
			boolean isAvailable = isEconomyClassSeatAvailable(seatNumber);
			if(isAvailable) {
				flightClass = FlightClass.ECONOMY;
				updateSeat(seatNumber);
			}else {
				System.out.println("Seat not available \nWould you like another seat assigned to you in first class?");
				System.out.println("if \"Yes\" enter 1, if \"No\" enter 2");
				int alternative = scan.nextInt();
				// if 2 was typed then it should move to the else statement
				if(alternative == 1) {
					for(int i = 1; i< 6; i++) {
						isAvailable = seats[i];
						if(!isAvailable) {
							flightClass = FlightClass.FIRST_CLASS;
							updateSeat(seatNumber);
							updatePassengerSeat(i);
							break;// Once a seat is found stop the loop
						}else {
							System.out.println("Sorry, no seat available");
						}
					}
				}
			}//end of inner else condition
		}else {
			System.out.println("Next flight is in 3 hours");
		}
	}
	public FlightClass getFlightClass(){
		return flightClass;
	}
	
	public boolean isFirstClassSeatAvailable(int seatNumber) {
		// if seat number is not available no seat is assigned
		boolean choice = false;
		if(seatNumber > 0 && seatNumber <= 5) {
			choice = seats[seatNumber];
			if(!choice) {
				return true;
			}else
				return false;
		}else if(seatNumber > 5) {
			System.out.println("Seat number only available in economy");
			return choice;
		}
		else {
			return choice;
		}
		
	}
	public boolean isEconomyClassSeatAvailable(int seatNumber) {
		boolean choice = false;
		if(seatNumber > 5 && seatNumber <= 10) {
			choice = seats[seatNumber];
			if(!choice)
				return true;
			else
				return false;
		}else if(seatNumber > 10) {
			System.out.println("No such seat available");
			return choice;
		}else
			return choice;
	}
	public String toString() {
		return String.format("Your seatNumber is 00%d.%nYou are flying %s", getSeatNumber(), getFlightClass());
	}
	
	
}
