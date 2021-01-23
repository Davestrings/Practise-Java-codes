package file;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Exercise.MenuOption;

class CreditEnquiryTest {
	CreditEnquiry auditor;
	private MenuOption[] options = MenuOption.values();
	@BeforeEach
	void setUp() throws Exception {
		auditor = new CreditEnquiry();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void requestTest() {
		assertEquals(MenuOption.CREDIT_BALANCE, auditor.getRequest());
	}
	@Test
	void largeInputTest() {
		//with input value greater than 4
		assertEquals(MenuOption.CREDIT_BALANCE, auditor.getRequest());
	}
	@Test 
	void noneDigitValueTest() {
		//with floating point values
		assertEquals(MenuOption.END, auditor.getRequest());
	}
	@Test
	void stringValueTest() {
		//with string/char value
		assertEquals(MenuOption.END, auditor.getRequest());
	}
	
	@Test
	void readFileTest() {
		MenuOption acct = MenuOption.CREDIT_BALANCE;
		CreditEnquiry.readRecord(acct);
	}

}
