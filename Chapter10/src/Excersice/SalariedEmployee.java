package Excersice;

public class SalariedEmployee extends Employee {
	private double salary;

	public SalariedEmployee(String firstName, String lastName, String SSN, Date birthday, double salary) {
		super(firstName, lastName, SSN, birthday);
		this.salary = salary;
	}
	
	public SalariedEmployee(String fName, String lName, String SSN, Date birthday) {
		super(fName, lName, SSN, birthday);
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public double getPayableAmount() {
		return getSalary();
	}
	
	@Override
	public String toString() {
		return String.format("%s Salary: $%.2f", super.toString(), getSalary());
	}

}
