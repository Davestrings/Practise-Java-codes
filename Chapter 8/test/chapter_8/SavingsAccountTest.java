package chapter_8;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SavingsAccountTest {
	SavingsAccount yourSavings;
	SavingsAccount mySavings;
	@BeforeEach
	void setUp() throws Exception {
		yourSavings = new SavingsAccount(BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.06));
		 mySavings = new SavingsAccount(BigDecimal.valueOf(3000.00), BigDecimal.valueOf(0.06));
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void constructorTest() {
		assertNotNull(mySavings);
		assertNotNull(yourSavings);
	}
	@Test
	void savingAccountCanChangeInterestRate() {
		yourSavings.modifyInterestRate(BigDecimal.valueOf(0.04));
		assertEquals(BigDecimal.valueOf(0.04), mySavings.getAnnualInterestRate());
		//assertEquals(BigDecimal.valueOf((3000 * 0.04)/12), mySavings.calculateMonthlyInterest());
		SavingsAccount.modifyInterestRate(BigDecimal.valueOf(0.05));
		//assertEquals(BigDecimal.valueOf(10.417), yourSavings.calculateMonthlyInterest());
	}

}
