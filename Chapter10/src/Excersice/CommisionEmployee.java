package Excersice;

public class CommisionEmployee extends Employee {
	private double commission;
	private double totalSales;
	
	public CommisionEmployee(String firstName, String lastName, String SSN, Date birthday, double sales) {
		super(firstName, lastName, SSN, birthday);
		this.totalSales = sales;
		this.commission = sales * 0.3;
	}
	public CommisionEmployee(String fName, String lName, String SSN, Date birthday) {
		super(fName, lName, SSN, birthday);
	}
	public void setTotalSales(double sales) {
		totalSales = sales;
	}
	public double getTotalSales() {
		return totalSales;
	}

	
	public double getCommission() {
		return commission;
	}


	public void setCommission(double totalSales) {
		this.commission = totalSales * 0.3;
	}


	@Override
	public double getPayableAmount() {
		// TODO Auto-generated method stub
		return getCommission();
	}
	@Override
	public String toString() {
		return String.format("%s Commission: $%.2f", super.toString(), getCommission());
	}

}
