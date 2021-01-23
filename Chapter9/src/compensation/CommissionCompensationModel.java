package compensation;

public class CommissionCompensationModel extends CommissionModel {
	private double grossSales;
	private double commissionRate;
	
	
	public CommissionCompensationModel(double grossSales, double commissionRate) {
		//super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	@Override
	public double earning() {
		return grossSales * commissionRate;
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
