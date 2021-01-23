import java.util.Scanner;
public class HealthProfile {
	private String lastName;
	private String firstName;
	private String gender;
	private int height;
	private int weight;
	private int day;
	private int month;
	private int year;
	
	
	public HealthProfile(String lastName, String firstName, String gender, int height, int weight, int day, int month, int year) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.day = day;
		this.month = month;
		this.year = year;
				
	}
	
	
	public HealthProfile() {
		// TODO Auto-generated constructor stub
	}


	Scanner takeInput = new Scanner(System.in);
	
	public void setLastName() {
		System.out.print("Enter Last Name: ");
		lastName = takeInput.nextLine();
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName() {
		System.out.print("Enter First Name: ");
		firstName = takeInput.nextLine();
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setGender() {
		System.out.print("Enter Gender: ");
		gender = takeInput.nextLine();
	}
	public String getGender() {
		return gender;
	}
	
	public void setHeight() {
		System.out.print("Enter Height in inches: ");
		height = takeInput.nextInt();
	}
	public int getHeight() {
		return height;
	}
	
	public void setWeight() {
		System.out.print("Enter Weigh in pound: ");
		weight = takeInput.nextInt();
	}
	public int getWeight() {
		return weight;
	}
	
	public void setDay() {
		System.out.print("Enter Day of Birth: ");
		day = takeInput.nextInt();
	}
	public int getDay() {
		return day;
	}
	
	public void setMonth() {
		System.out.print("Enter Month of Birth: ");
		month = takeInput.nextInt();
	}
	public int getMonth() {
		return month;
	}
	
	public void setYear() {
		System.out.print("Enter year of Birth: ");
		year = takeInput.nextInt();
	}
	public int getYear() {
		return year;
	}
	
	public String displayDOB() {
		String DOB = (day + "/" + month + "/" + year);
		return DOB;
	}
	
	public int Age() {
		int age = 2019 - year;
		return age;
	}
	
	public int maxHeartRate() {
		int maxHeartRate = 220 - Age();
		return maxHeartRate;
	}
	
	public double targetHeartRate50() {
		double targetHeartRate50 = (50 * (double)maxHeartRate()) / 100;
			return targetHeartRate50;
	}
	
	public double targetHeartRate85() {
		double targetHeartRate85 = (85 * (double)maxHeartRate()) / 100;
			return targetHeartRate85;
	}
	
	public double BMI() {
		double BMI = ((double)getWeight() * 703) / (getHeight() * getHeight());
			return BMI;
	}
}
