package chapter7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DieRollTest {
	DieRoll  dice;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		dice = new DieRoll();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertNotNull(dice);
	}
	@Test
	void randomNumberTest() {
		assert(dice.rollDice() <=12);
		
	}
	@Test
	void rollTest() {
		int[] array = new int[11];
		dice.Roll(array );
	}

}
