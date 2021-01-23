package stock_keeping_app;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShopTest {
	Shop myShop;
	Attendant theAttendant;
	@BeforeEach
	void setUp() throws Exception {
		theAttendant = new Attendant("Yemi", "Adeshola", "RTU123", "Front-Desk", BigDecimal.valueOf(45000.250));
		myShop = new Shop("24 shola street", "Amazing Grace", "saturday", 9, 17, theAttendant);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void Constructortest() {
		assertNotNull(myShop);
		assertEquals(17, myShop.getClosingHours());
		assertEquals("Yemi Adeshola", theAttendant.getAttendantFullName("Yemi", "Adeshola"));
	}
	@Test
	void shopHasAttendant() {
		
	}

}
