package ooad_practise;

public class Guitar {
	private String serialNumber;
	private double price;
	private GuitarSpec guitarSpec;
	
	
	
	public Guitar(String serialNumber, float price, GuitarSpec guitarSpec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = guitarSpec;
	}
	
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}
}
