/**
 * 
 */
package accounts;

/**
 * @author USER
 *
 */
public class Account {
	private double balance;
	private String firstName;
	private String lastName;
	
	public Account() {}
	
	public Account(String firstName, String surname, double amount) {
		this.firstName = firstName;
		lastName = surname;
		this.balance = amount;
	}
	
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setBalance(double mybalance) {
		this.balance = mybalance;
	}
	public double getBalance() {
		return balance;
	}
	public void processAccount(int task, double amount){
		if(task == 1) {
			balance = balance + amount;
		}
	}
}
