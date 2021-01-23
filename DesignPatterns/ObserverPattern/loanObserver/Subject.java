package loanObserver;

public interface Subject {
	public void addObserver(Observers observer);
	public void removeObserver(Observers observer);
	public void notifyObserver();
}
