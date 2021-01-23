package chapter_8;

import java.math.BigDecimal;

public class SavingsAccount {
	private BigDecimal savingsBalance;
	private static BigDecimal annualInterestRate;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(BigDecimal interestRate){
		SavingsAccount.annualInterestRate = interestRate;
	}

	public SavingsAccount(BigDecimal savingsBalance, BigDecimal interestRate) {
		this.savingsBalance = savingsBalance;
		SavingsAccount.annualInterestRate = interestRate;
	}
	
	public void setSavingsAccountBalance(BigDecimal savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public BigDecimal getSavingsAccountBalance() {
		return savingsBalance;
	}
	
	public static void modifyInterestRate(BigDecimal interestRate) {
		SavingsAccount.annualInterestRate = interestRate;
	}
	public BigDecimal getAnnualInterestRate() {
		return SavingsAccount.annualInterestRate;
	}
	public BigDecimal calculateMonthlyInterest() {
		BigDecimal product = savingsBalance.multiply(getAnnualInterestRate()) ;
		BigDecimal numOfMonths = new BigDecimal("12");
		return product.divide(numOfMonths);
	}
}
