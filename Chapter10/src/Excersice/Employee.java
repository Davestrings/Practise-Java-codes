/*
 *  Assume that payroll is processed once per month.
Create an array of Employee variables to store references to the various employee objects. In a loop,
calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
payroll amount if the current month is the one in which the Employee’s birthday occurs
 * */

package Excersice;

public abstract class Employee implements Payable {
	private Date birthdate;
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee(String firstName, String lastName, String SSN, Date birthday) {
		this.firstName = firstName;
		this.lastName = lastName;
		socialSecurityNumber = SSN;
		birthdate = birthday;
	}
	
	public abstract double getPayableAmount();

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
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
	
	public String toString() {
		return String.format("Mr %s %s SocialSecurityNumber: %s, Birthdate: %s", getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthdate());
	}

}
