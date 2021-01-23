package crap_game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DieTest {
	Die die;
	Die redDie;
	@BeforeEach
	void setUp() throws Exception {
		redDie = new RedDie();
	}
	

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void dieClasstest() {
		assertNull(die); // cannot instantiate abstract class
		assertNotNull(redDie);
		
	}

}
