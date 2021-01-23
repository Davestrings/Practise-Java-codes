package employee;

public class BaseCommissionEmployee extends CommisionEmployee{
	private double baseSalary;
	
	public BaseCommissionEmployee(String name, String surname, String social, double sales, double commission, double base) {
		super(name, surname, social, sales, commission);
		baseSalary = base;
	}

	
	@Override
	public double earning() {
		return super.earning()* getBaseSalary();
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	

}
