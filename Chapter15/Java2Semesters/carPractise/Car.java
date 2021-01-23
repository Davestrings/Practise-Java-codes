package carPractise;

public class Car {
	private int registrationNum;
	private String make;
	private double price;
	
	public Car(int regNum, String makeln, double priceln) {
		registrationNum = regNum;
		make = makeln;
		price = priceln;
	}

	public int getRegistrationNum() {
		return registrationNum;
	}

	public void setRegistrationNum(int registrationNum) {
		this.registrationNum = registrationNum;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
