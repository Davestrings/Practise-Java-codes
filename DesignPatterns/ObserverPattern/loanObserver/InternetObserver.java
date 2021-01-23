package loanObserver;

public class InternetObserver implements Observers, DisplayInfo {
	private float interest;
	private Subject someLoan;
	
	public InternetObserver(Subject someLoan) {
		this.someLoan = someLoan;
		someLoan.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("========== Spark Network =========");
		System.out.println("New interest is now " + interest);
	}

	@Override
	public void update(float interest) {
		this.interest = interest;
		display();
	}

}
