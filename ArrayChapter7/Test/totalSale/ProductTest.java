package totalSale;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {
	Product product;
	@BeforeEach
	void setUp() throws Exception {
		product = new Product();
		product = new Product(001, BigDecimal.valueOf(1500));
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void productExistTest() {
		assertNotNull(product);
	}
	@Test
	void productHasNumberAndPriceTest() {
		assertEquals(BigDecimal.valueOf(1500), product.getPrice());
		assertEquals(001, product.getProductNumber());
	}

}
