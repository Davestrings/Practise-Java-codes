package Excersice;

public class HourlyEmployee extends Employee {
	private int standardHours;
	private int hoursWorked;
	private double pay;
	private double overtimePayRate;

	public HourlyEmployee(String firstName, String lastName, String SSN, Date birthday, double pay, double overTime, int hourWorked, int sHours) {
		super(firstName, lastName, SSN, birthday);
		overtimePayRate = overTime;
		this.pay = pay + ((hourWorked - sHours) * (pay * overTime));
		hoursWorked = hourWorked;
		standardHours = sHours;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public void setStandardHours(int hour) {
		standardHours = hour;
	}
	public int getStandardHours() {
		return standardHours;
	}
	
	
	public void setPay(double pay) {
		this.pay = pay + ((getHoursWorked() - getStandardHours()) * (pay * getOvertimePayRate()));
	}
	public double getPay() {
		return pay;
	}
	
	
	public void setOverTimePayRate(double rate) {
		overtimePayRate = rate;
	}
	public double getOvertimePayRate() {
		return overtimePayRate;
	}

	@Override
	public double getPayableAmount() {
		// TODO Auto-generated method stub
		return getPay();
	}
	
	@Override
	public String toString() {
		return String.format("%s %.2f", super.toString(), getPay());
	}

}
