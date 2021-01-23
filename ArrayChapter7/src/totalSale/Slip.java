package totalSale;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Slip {
	private BigDecimal totalPrice;
	private List<Product> products = new ArrayList<Product>();
	private List<Integer> productNumber = new ArrayList<Integer>();
	
	public Slip(List<Product> list) {
		products.addAll(list);
	}
	public Slip() {}
	
	
	public void addAllProduct(List<Product> productList) {
		/**
		 * Appends a whole list to the end of the list
		 * 
		 * */
		products.addAll(productList);
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public List<Product> getAllProducts(){
		System.out.println(products);// please remove this.
		return products;
	}
	private void addProductNumber() {
		Iterator<Product> iterator = products.iterator();
		
		while(iterator.hasNext()) {
			Product product = iterator.next();
			if(productNumber.contains(product.getProductNumber())) {
				continue;
			}else {
			productNumber.add(product.getProductNumber());
			}
		}
	}
	
	public List<Integer> allProductNumber(){
		addProductNumber();
//		System.out.println(productNumber);
		return productNumber;
	}
	
	public int getProductNumber(Product product) {
		addProductNumber();
		/**
		 * method returns -1 if product is not in the list of products
		 * returns the product number of the product
		 * 
		 * */
		int productNum = -1;
		if(products.contains(product)) {
			return productNum = product.getProductNumber();
		}
		return productNum;
	}
	
	public void setTotalPrice() {
		totalPrice = BigDecimal.ZERO;
		Iterator<Product> iterator = products.iterator();
		
		if(!products.isEmpty()) {
			while(iterator.hasNext()) {
				Product product = iterator.next();
				totalPrice = totalPrice.add(product.getPrice());
			}
		}else {
			System.out.println("Slip is empty");
		}
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	
	public String toString() {
		return String.format("Products: %s%nTotal Price: %s", getAllProducts(), getTotalPrice());
	}
	
}
