package loanObserver;

public class NewsOutlets implements Observers, DisplayInfo {
	private float interest;
	private Subject someLoan;
	
	public NewsOutlets(Subject someLoan) {
		this.someLoan = someLoan;
		this.someLoan.addObserver(this);//someloan adds the object of NewsOutlets to the list of observers in Loan 
	}

	@Override
	public void display() {
		System.out.println("================ Punch Breaking News =============");
		System.out.println("New interest is now " + interest);
	}

	@Override
	public void update(float interest) {
		// the interest parameter updates this class' interest field
		this.interest = interest;
		display();
	}

}
