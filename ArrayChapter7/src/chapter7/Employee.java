package chapter7;

public class Employee {
	private String firstName;
	private String lastName;
	private static int minWage;
	private Date birthDate;
	private Date hireDate;
	
	
	
	public Employee() {
		this(null,null);
	}

	
	public Employee(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	
	public Employee(String fName, String lName, Date birthDate, Date hireDate) {
		firstName = fName;
		lastName = lName;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
	}

	public static int getMinWage() {
		return minWage;
	}


	public static void setMinWage(int minWage) {
		Employee.minWage = minWage;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public Date getHireDate() {
		return hireDate;
	}


	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}


	public void setFirstName(String fName) {
		firstName = fName;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}
	public String toString() {
		return String.format("%s %s hired: %s birthDay: %s", firstName,lastName, hireDate, birthDate);
	}

	public void setLastName(String lName) {
		lastName = lName;
		
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	

}
