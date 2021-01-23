package employee;

public class CommisionEmployee extends Employee {
	
	private double grossSales;
	private double commissionRate;
	
	public CommisionEmployee(String fName, String lName, String securityNumber, double sales, double commission) {
		super(fName, lName, securityNumber);
		grossSales = sales;
		commissionRate = commission;
	}
	
	public double earning() {
		return commissionRate * grossSales;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

}
