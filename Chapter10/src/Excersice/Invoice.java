package Excersice;

public class Invoice implements Payable {
	private String partDescription;
	private String partNumber;
	private int quantity;
	private double pricePerItem;
	
	
	
	public Invoice(String partDescription, String partNumber, int quantity, double pricePerItem) {
		if(quantity < 0) {
			throw new IllegalArgumentException("Quantity should be more than 0");
		}
		if(pricePerItem <= 0) {
			throw new IllegalArgumentException("Price of an item should be greater than 0");
		}
		
		this.partDescription = partDescription;
		this.partNumber = partNumber;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}



	public String getPartDescription() {
		return partDescription;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity < 0) {
			throw new IllegalArgumentException("Quantity should be more than 0");
		}
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		if(pricePerItem <= 0) {
			throw new IllegalArgumentException("Price of an item should be greater than 0");
		}
		this.pricePerItem = pricePerItem;
	}

	@Override
	public String toString() {
		return String.format("Part description: %s Part Number: %s Quantity: %d Price Of Item: %5.2f", getPartDescription(), getPartNumber(), getQuantity(), getPricePerItem());
	}

	public double getPayableAmount() {
		return getQuantity() * getPricePerItem();
	}
}
