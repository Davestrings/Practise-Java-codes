/**
 * 
 */
package iterators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author USER
 *
 */
class CalculatorTest {
	Calculator calculator;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void calculatorIsNotNullTest() {
		
	}
	
	@Test
	void calculatorCanAddTest() {
		assertEquals(4, calculator.add(2,2));
		assertEquals(5, calculator.add(2,3));
		assertEquals(7, calculator.add(2,5));
	}
	@Test
	void calculatorCanAddDoubleTest() {
		assertEquals(14.0, calculator.add(6.0, 8.0));
	}
	
	@Test
	void calculatorCanSubtractTest() {
		assertEquals(3, calculator.subtract(4,1));
	}
	@Test
	void calculatorCanSubtracAbsolutelyTest() {
		assertEquals(3, calculator.subtract(1,4));
	}
	@Test
	void calculatorCanSubstractDoubleAbsolutelyTest() {
		assertEquals(3.0, calculator.subtract(4.0,1.0));
		assertEquals(3.0, calculator.subtract(1.0,4.0));
		assertEquals(3.0, calculator.subtract(5.5,2.5));
		assertEquals(3.4, calculator.subtract(5.9,2.5));
	}


}
