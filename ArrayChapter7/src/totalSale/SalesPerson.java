package totalSale;

import java.math.BigDecimal;
//import java.util.ArrayList;
import java.util.List;

public class SalesPerson {
	private int salesPersonNumber;
//	private List<Product> products = new ArrayList<Product>();
	private Slip slip;
	
	public SalesPerson(int personId, Slip slip) {
		salesPersonNumber = personId;
		this.slip = slip;
	}
	public SalesPerson(int personId) {
		salesPersonNumber = personId;
	}
	
	public void setSalesPersonNumber(int number) {
		salesPersonNumber = number;
	}
	public int getSalesPersonNumber() {
		return salesPersonNumber;
	}
	/*
	 * Sales person can add products to the slip
	 * */
	
	public void addProductToSlip(Slip slip, Product product) {
		slip.addProduct(product);
	}
	public void addAllProductToSlip(Slip slip, List<Product> products) {
		slip.addAllProduct(products);
	}
	/*
	 * Compute sales total
	 * */
	public BigDecimal total(Slip slip) {
		slip.setTotalPrice();
		return slip.getTotalPrice();
	}
	
}
