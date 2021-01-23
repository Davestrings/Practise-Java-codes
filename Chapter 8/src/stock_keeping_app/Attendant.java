package stock_keeping_app;

import java.math.BigDecimal;

public class Attendant {
	private String firstName;
	private String lastName;
	private String attendantId;
	private String role;
	private BigDecimal salary;
	
	public Attendant(String firstName, String lastName, String attendantId, String role, BigDecimal salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.attendantId = attendantId;
		this.salary = salary;
	}
	public Attendant(String fistName, String lastName) {
		this.firstName = fistName;
		this.lastName = lastName;
	}
	
	public String getAttendantFullName(String firstName, String lastName) {
		return String.format("%s %s", firstName, lastName);
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

	public String getAttendantId() {
		return attendantId;
	}

	public void setAttendantId(String attendantId) {
		this.attendantId = attendantId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("%s%s%s%s%d", firstName, lastName, attendantId, role, salary);
	}
	

}
