package totalSale;

import java.math.BigDecimal;

public class Product {
	private int productNumber;
	private BigDecimal price;
	
	public Product(int productNumber, BigDecimal price) {
		this.price = price;
		this.productNumber = productNumber;
	}
	public Product() {}
	
	public void setProductNumber(int number) {
		productNumber = number;
	}
	public int getProductNumber() {
		return productNumber;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public String toString() {
		return String.format("Product Number: %d  Price: %s", getProductNumber(), getPrice());
	}

}
