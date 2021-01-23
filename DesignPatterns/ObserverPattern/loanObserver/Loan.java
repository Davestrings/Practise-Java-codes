package loanObserver;

import java.util.ArrayList;

public class Loan implements Subject {
	private ArrayList<Observers> observer;
	public float interest;

	
	public Loan() {
		this.observer = new ArrayList<Observers>();
	}
	
	public void interestChanged() {
		notifyObserver();
	}
	@Override
	public void addObserver(Observers observer) {
		this.observer.add(observer);
		
	}

	@Override
	public void removeObserver(Observers observer) {
		int index = this.observer.indexOf(observer);
		if(index >= 0)
			this.observer.remove(index);
		
	}

	@Override
	public void notifyObserver() {
		// notify the observers on my list 
		for(Observers obj : observer)
			obj.update(interest);
	}
	
	public void setInterest(float interest) {
		//Interest is updated using this method and this method register the action that interest has changed by calling interstChanged()
		this.interest = interest;
		interestChanged();
	}

}
