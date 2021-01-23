package Excersice;

public class PieceWorker extends Employee {
	private int piecesProduced;
	private double wagePerPiece;

	public PieceWorker(String firstName, String lastName, String SSN, Date birthday) {
		super(firstName, lastName, SSN, birthday);
	}
	public PieceWorker(String fName, String lName, String SSN, Date birthday, double wage) {
		super(fName, lName, SSN, birthday);
		this.wagePerPiece = wage;
	}
	public void setPiecesBought(int pieces) {
		if(pieces < 1)
			throw new IllegalArgumentException("At least a pieces of should be bought");
		else {
			piecesProduced = pieces;
		} 
	}
	public double getPiecesBought() {
		return piecesProduced;
	}
	public void setWage(int wage) {
		this.wagePerPiece = wage;
	}
	public double getWage() {
		return wagePerPiece;
	}

	@Override
	public double getPayableAmount() {
		// TODO Auto-generated method stub
		return getWage() * getPiecesBought();
	}
	@Override
	public String toString() {
		return String.format("%s %.2f", super.toString(), getPayableAmount());
	}

}
