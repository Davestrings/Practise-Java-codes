package compensation;

public class Employee {
	private String firstName;
	private String lastName;
	private String social;
	private CommissionModel commission;
	
	
	public Employee(String firstName, String lastName, String social, CommissionModel commission) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.social = social;
		this.commission = commission;
	}
	
	public double earning() {
		return commission.earning();
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
	public String getSocial() {
		return social;
	}
	public void setSocial(String social) {
		this.social = social;
	}
	public CommissionModel getCommission() {
		return commission;
	}
	public void setCommission(CommissionModel commission) {
		this.commission = commission;
	}

}
