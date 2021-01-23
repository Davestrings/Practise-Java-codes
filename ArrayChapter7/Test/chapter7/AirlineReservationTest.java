package chapter7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AirlineReservationTest {
	AirlineReservation airport1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		airport1 = new AirlineReservation();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
//	void sectionChoicetest() {
//		airport1.setSectionChoice();
//		assertEquals(1, airport1.getSectionChoice());
//		airport1.setSectionChoice();
//		assertEquals(2, airport1.getSectionChoice());
//	}
	@Test
	void assignSeatTest() {
		byte sectionChoice = 1;
		airport1.assignSeat(sectionChoice);
//		assertEquals(true,	airport1.seat[0]); // don't forget to set access modifier of seat back to private.
//		assertEquals(false, airport1.seat[1]);
		airport1.setSectionChoice();
		assertEquals(1, airport1.getSectionChoice());
		assertEquals(1, airport1.getFirstMonitor());
		sectionChoice = 2;
		airport1.assignSeat(sectionChoice);
//		assertEquals(true, airport1.seat[5]);
	}

}
