package compensation;

public class BasePlusCommissionCompensationModel extends CommissionCompensationModel {
	private double baseSalary;

	public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {
		super(grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earning() {
		return getBaseSalary() +  super.earning();
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

}
