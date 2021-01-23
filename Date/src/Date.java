
public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	public int getDay() {
		return day;
	}
	
	public void setMonth(int month) {
			this.month = month;
	}
	public int getMonth() {
		return month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	
	public String displayDate(int day, int month, int year) {
		if(day <= 30 && month <= 12) { 
			String date = (day + "/" + month + "/" + year);
			return date;
		}else {
			 String date = ("day and  month values are not valid");
			 return date;
		}
	}
	
}
