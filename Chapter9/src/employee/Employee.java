package employee;

public class Employee {
	private String firstName;
	private String lastName;
	private  String socialSecurityNumber;
	
	


	
	public Employee(String fName, String lName, String securityNumber) {
		firstName = fName;
		lastName = lName;
		socialSecurityNumber = securityNumber;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
}
