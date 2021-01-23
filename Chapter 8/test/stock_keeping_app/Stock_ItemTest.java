package stock_keeping_app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Stock_ItemTest {
	private Logger logger = Logger.getLogger(Stock_ItemTest.class.getName());
	
	Stock_Item theStock;
	@BeforeEach
	void setUp() throws Exception {
		theStock = new Stock_Item();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void constructorTest() {
		assertNotNull(theStock);
		Stock_Item myStock = new Stock_Item("123ASD", "RTU104", ItemCategory.IRON, 100);
		assertNotNull(myStock);
		assertEquals("123ASD", myStock.getItemId());
		assertEquals("RTU104", myStock.getBatchNumber());
		assertEquals(ItemCategory.IRON, myStock.getStock());
	}

	@Test
	void stock_ItemCanGetItemId() {
		theStock.setItemId("Stringer123");
		assertEquals("Stringer123", theStock.getItemId());
	}
	@Test
	void stock_ItemCanGetBrand() {
		assertEquals("DSTV", theStock.getItemBrand(ItemCategory.DECODER));
		assertEquals("Hisense", theStock.getItemBrand(ItemCategory.ELECTRIC_KETTLE));
	}
	@Test
	void stock_ItemCanListAllBrands() {
		assertNotNull(theStock);
		ItemCategory myItem = ItemCategory.ELECTRIC_KETTLE;
		theStock.setStockItem(myItem);
//		theStock.displayAllBrands();
	}
	
//	@Test
////	void stock_ItemCanCalculateTotalStock() {
//		ArrayList<ItemCategory> itemArray = new ArrayList();
//		
////		System.out.println(itemArray.size());
//		for(ItemCategory mystock : theStock.getStock().values()) {
//			logger.info(mystock.toString());
//			System.out.println(mystock.getQuantity());
//			itemArray.add(mystock);
//		}
//		int total = 0;
//		ItemCategory myItem = ItemCategory.ELECTRIC_KETTLE;
//		System.out.println(itemArray.size());
//		for(int count = 0; count < itemArray.size(); count++){
//			total += myItem.getQuantity();
//		}
//		System.out.println();
//		System.out.println(total);
//		assertEquals(282, total);
//	}
	
//	@Test
//	void stock_ItemCanCalculateTotalStock() {
//		ItemCategory item = ItemCategory.AIR_CONDITION;
//		
//		assertEquals(297, theStock.calculateTotalStock(item));
//	}
	
	@Test
	void stock_ItemCanGetPriceOfEachItem() {
		ItemCategory myItem = ItemCategory.MICROWAVE;
		theStock.setStockItem(myItem);
		assertEquals(12000, theStock.getPriceOfEachItem());
	}
}
