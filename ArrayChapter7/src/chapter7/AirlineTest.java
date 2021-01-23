package chapter7;

public class AirlineTest {

	public static void main(String[] args) {
		AirlineReservationSys reserve = new AirlineReservationSys();
		
		System.out.println(reserve.isFirstClassSeatAvailable(5));
		System.out.println(reserve.isEconomyClassSeatAvailable(10));
		
		int count = 1;
		while(count <= 3) {
			reserve.seatNumber();
			System.out.println(reserve.toString());
			System.out.println(reserve.getSeatNumber());
			System.out.println("----------------------");
			count++;
		}
		

	}

}
