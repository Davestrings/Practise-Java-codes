package totalSale;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalesPersonTest {
	SalesPerson person, person2, person3;
	Slip slip;
	Product product;
	@BeforeEach
	void setUp() throws Exception {
		product = new Product(023, BigDecimal.valueOf(1500.25));
		slip = new Slip();
		person = new SalesPerson(003);
		person2 = new SalesPerson(001, slip);
		person3 = new SalesPerson(002, slip);
	}

	@AfterEach
	void tearDown() throws Exception {
		person = null;
		person2 = null;
		person3 = null;
		slip = null;
	}

	@Test
	void salesPersonExistTest() {
		assertNotNull(person);
		assertNotNull(person2);
		assertNotNull(person3);
	}
	@Test
	void salesPersonHasIDTest() {
		assertEquals(3, person.getSalesPersonNumber());
		assertEquals(1, person2.getSalesPersonNumber());
	}

	@Test
	void salesPersonCanAddProductTest() {
		person.addProductToSlip(slip, product);
//		System.out.println(slip);
	}
	@Test
	void salesPersonCanComputeTotalTest() {
		person.addProductToSlip(slip, product);
		assertEquals(BigDecimal.valueOf(1500.25), person.total(slip));
		assertEquals(BigDecimal.valueOf(1500.25), slip.getTotalPrice());
	}
}
