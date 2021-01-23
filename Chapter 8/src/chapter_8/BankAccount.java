package chapter_8;

import java.math.BigDecimal;

public class BankAccount {
	private String accountNumber;
	private String accountName;
	private BigDecimal balance;
	
	public BankAccount(String numberln, String nameln) {
		accountNumber = numberln;
		accountName = nameln;
		balance = BigDecimal.ZERO;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public BigDecimal getBalance() {
		return balance;
	}
	
	public void deposit(BigDecimal amountln) {
		balance = balance.add(amountln);
	}
	
	public boolean withdraw(BigDecimal amountln) {
		if(amountln.compareTo(balance) > 1) {
			return false;
		}else {
			balance = balance.subtract(amountln);
			return true;
		}
	}

}
