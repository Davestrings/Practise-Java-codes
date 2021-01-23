package Exercise;


public class TransactionRecord {
	private int accountNumber;
	private double amount;
	
	public TransactionRecord() {
		this(0, 0.00);
	}
	public TransactionRecord(int acctNum, double amount) {
		accountNumber = acctNum;
		this.amount = amount;
	}
	
	public void setAccountNumber(int account) {
		accountNumber = account;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
}
