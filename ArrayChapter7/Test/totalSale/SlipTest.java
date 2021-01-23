package totalSale;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SlipTest {
	Slip slip;
	Product product = new Product(002, BigDecimal.valueOf(1500));
	ArrayList<Product> list = new ArrayList<Product>();
	@BeforeEach
	void setUp() throws Exception {
		list.add(new Product(001, BigDecimal.valueOf(1000)));
		list.add(product);
		list.add(new Product(003, BigDecimal.valueOf(1700)));
		slip = new Slip(list);
	}

	@AfterEach
	void tearDown() throws Exception {
		product = null;
	}

	@Test
	void slipCanCalculateTotalPriceTest() {
		slip.setTotalPrice();
		assertEquals(BigDecimal.valueOf(4200), slip.getTotalPrice());
	}

	@Test
	void slipCanGetAllProductNumber() {
		slip.allProductNumber();
		/*
		 * How do i assert an array content?
		 * */
		assertEquals(2, slip.getProductNumber(product));
	}
	
	@Test
	void slipCanAddProductsTest() {
		Product product1 = new Product();
		Product product2 = new Product(004, BigDecimal.valueOf(2000));
		Product product3 = new Product(005, BigDecimal.valueOf(2500));
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(product2); list.add(product1); list.add(product3);
		
		
		slip.addAllProduct(list);
		slip.getAllProducts();
	}
}
