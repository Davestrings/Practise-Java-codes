package Excersice;

public class BasePlusCommissionEmployee extends CommisionEmployee {
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String SSN, Date birthday, double sales, double base) {
		super(firstName, lastName, SSN, birthday, sales);
		baseSalary = base;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public double getPayableAmount() {
		return getBaseSalary() + super.getCommission();
	}

	@Override
	public String toString() {
		return String.format("%s BaseSalary: $%.2f", super.toString(), getBaseSalary());
	}
}
