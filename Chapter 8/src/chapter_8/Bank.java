package chapter_8;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {

	ArrayList<BankAccount> list = new ArrayList();
	
	private int search(String accountNumberln) {
		for(int i = 0; i <= list.size()-1; i++) {
			BankAccount tempAccount = list.get(i); // find the account at index i
			String tempNumber = tempAccount.getAccountNumber();  // get account number
			if(tempNumber.equals(accountNumberln)) { // if this is the account we are looking for
				return i;  //return the index
			}
		}
		return -999;
	}
	
	//return an account with a particular account number
	public BankAccount getItem(String accountNumberln) {
		int index = search(accountNumberln);
		if(index != -999) { //check that account exists
			return list.get(index);
		}else {
			return null; //no such account
		}
	}
	
	//add an item to the list
	public boolean addAccount(String accountNumberln, String nameln) {
		if(search(accountNumberln) == -999) {
			list.add(new BankAccount(accountNumberln, nameln));
			return true;
		}
		return false;
	}
	
	//deposit money in a specified account
	public boolean deposit(String accountNumberln, BigDecimal amountln) {
		BankAccount acc = getItem(accountNumberln);
		if(acc != null) {
			acc.deposit(amountln);
			return true;
		}else {
			return false;
		}
	}
	//withdraw money in a specified account
	public boolean withdraw(String accountNumberln, BigDecimal amountln) {
		BankAccount acc = getItem(accountNumberln);
		if(acc != null && amountln.compareTo(acc.getBalance()) > -1) {
			acc.withdraw(amountln);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean removeAccount(String accountNumberln) {
		int index = search(accountNumberln);
		if(index != -999) {
			list.remove(index);
			return true;
		}else {
			return false;
		}
	}
}
