package Exercise;

public class Account {
	private int accountNum;
	private String firstName;
	private String lastName;
	private double amount;
	
	public Account(int acc, String fName, String lName, double amount) {
		accountNum = acc;
		firstName = fName;
		lastName = lName;
		this.amount = amount;
	}
	
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void combineRecord(TransactionRecord transRecord) {
		amount += transRecord.getAmount();
	}
	
}
