package Excersice;

public class Date {
	private int day;
	private int month;
	private int year;
	
	//constructors
	public Date(int day, int month, int year) {
		//assuming there are no leap year
		if(day < 0 || day > 28 && month != 2)
			throw new IllegalArgumentException("Day should greater than 0 and less than 29 for this month");
		else if (day < 0 || day > 30 &&(month != 4 || month != 6 || month != 9 || month != 11))
			throw new IllegalArgumentException("Day should be greater than 0 and less than 31 for this month");
		else if(day < 0 || day > 31  &&(month != 1 || month != 3 || month != 5 || month != 7 || month!=8 ||month != 10 || month != 12))
			throw new IllegalArgumentException("Day should be greater than 0 and less than 32 for this month");
			
		this.day = day;
		if(month < 0 || month > 12)
			throw new IllegalArgumentException("Month should be less than 13 and greater than 0");
		this.month = month;
		
		this.year = year;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		if(day < 0 || day > 28 && month == 2)
			throw new IllegalArgumentException("Day should greater than 0 and less than 29 for this month");
		else if (day < 0 || day > 30 &&(month == 4 || month == 6 || month == 9 || month == 11))
			throw new IllegalArgumentException("Day should be greater than 0 and less than 31 for this month");
		else if(day < 0 || day > 31  &&(month == 1 || month == 3 || month == 5 || month == 7 || month==8 ||month == 10 || month == 12))
			throw new IllegalArgumentException("Day should be greater than 0 and less than 32 for this month");

		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		if(month < 0 || month > 12)
			throw new IllegalArgumentException("Month should be less than 13 and greater than 0");

		this.month = month;
	}


	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return String.format("%d-%d-%d", getDay(), getMonth(), getYear());
	}

	
	

}
