package stock_keeping_app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvoiceTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void constructorTest() {
		Invoice myInvoice = new Invoice(ItemCategory.AIR_CONDITION);
		assertNotNull(myInvoice);
		assertEquals(45000, ItemCategory.AIR_CONDITION.getPricePerItem());
		assertEquals(45000, myInvoice.getPriceOfItem());
		
		//second object
		Invoice theInvoice = new Invoice("John Doe", ItemCategory.FREEZER, 20);
		assertEquals("John Doe", theInvoice.getName());
		assertEquals(75000, theInvoice.getPriceOfItem());
		assertEquals("Hier Thermocool", ItemCategory.FREEZER.getBrand());
		assertEquals(15, ItemCategory.FREEZER.getQuantity());
		assertEquals(ItemCategory.FREEZER, theInvoice.getStockItemCategory());
		assertEquals(20, theInvoice.getQuantityOfItemBought());
		ItemCategory.FREEZER.setBrand("Hisense");
		assertEquals("Hisense", ItemCategory.FREEZER.getBrand());
		
	}
	
	@Test
	void invoiceCanGetItemPrice() {
		Invoice myInvoice = new Invoice();
		myInvoice.setPriceOfItem(ItemCategory.AIR_CONDITION);
		assertEquals(45000, myInvoice.getPriceOfItem());
		myInvoice.setPriceOfItem(ItemCategory.DESKTOP);
		assertEquals(35000, myInvoice.getPriceOfItem());
	}
	@Test
	void invoiceCanGetCostomerName() {
		Invoice myInvoice = new Invoice();
		myInvoice.setName("John Doe");
		assertEquals("John Doe", myInvoice.getName());
		
	}
	@Test
	void invoiceCanGetQuantityOfItemBought() {
		Invoice myInvoice = new Invoice();
		myInvoice.setQuantityOfItemBought(10);
		assertEquals(10, myInvoice.getQuantityOfItemBought());
		
	}
	@Test
	void invoiceCanChangeItemBought() {
		Invoice myInvoice = new Invoice();
		myInvoice.setStockItemCategory(ItemCategory.PERSONAL_COMPUTER);
		assertEquals(ItemCategory.PERSONAL_COMPUTER, myInvoice.getStockItemCategory());
		myInvoice.setPriceOfItem(ItemCategory.PERSONAL_COMPUTER);
		assertEquals(75000, myInvoice.getPriceOfItem());
		myInvoice.displayItemList();
	}

}
