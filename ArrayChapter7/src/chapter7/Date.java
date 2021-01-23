package chapter7;

public class Date {
	private int day;
	private int month;
	private int year;
	
	private final int[] daysOfTheMonth= {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Date() {
		
	}
	
	public Date(int day, int month, int year) {
		if(day < 0 || day > daysOfTheMonth[month] && !(month ==2 && day ==29)){
			throw new IllegalArgumentException("day" + day + "out of range for that month");
		} 
		if(month < 0 || month > 12) {
			throw new IllegalArgumentException("month "+month+ "out of range");
		}
		if(month ==2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
			throw new IllegalArgumentException("year" + year + "out of Range");
		}
		
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return String.format("%d/%d/%d", day,month,year);
	}
	
	
}
