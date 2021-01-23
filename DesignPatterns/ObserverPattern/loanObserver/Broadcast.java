package loanObserver;

public class Broadcast {

	public static void main(String[] args) {
		Loan someLoan = new Loan();
		InternetObserver spark = new InternetObserver(someLoan);
		NewsOutlets punch = new NewsOutlets(someLoan);
		
		someLoan.setInterest(45.67f);
		someLoan.setInterest(41.67f);
		

	}

}
