
public class HeartRate {
	private String lastName;
	private String firstName;
	private int day;
	private int month;
	private int year;
	
	public HeartRate(String lastName, String firstName, int day, int month, int year) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	public HeartRate() {
		// TODO Auto-generated constructor stub
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
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
	
	public String displayDOB() {
		String DOB = (day + "/" + month + "/" + year);
			return DOB;
	}
	
	public int displayAge() {
		int age = 2019 - year;
			return age;
	}
	
	public int getMaxHeartRate() {
		int maxHeartRate = 220 - displayAge();
			return maxHeartRate;
	}
	
	public int targetHeartRate50() {
		int targetHeartRate50 = (50 * getMaxHeartRate()) / 100;
			return targetHeartRate50;
	}
	
	public int targetHeartRate85() {
		int targetHeartRate85 = (85 * getMaxHeartRate()) / 100;
			return targetHeartRate85;
	}
	
}
