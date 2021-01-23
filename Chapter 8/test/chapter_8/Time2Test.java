package chapter_8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Time2Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@org.junit.jupiter.api.Test
	void constructorTest() {
		Time2 time = new Time2(2, 10, 35);
		assertNotNull(new Time2(2, 10, 35));
		assertNotNull(new Time2());
		assertNotNull(new Time2(1, 10));
		
	}
	
	@Test
	void time2CanGetTotalSeconds() {
		Time2 time = new Time2(3, 10, 35);
		Time2 time1 = new Time2(1, 20);
		assertEquals(11435, time.getTimeAsSeconds());
		assertEquals(4800, time1.getTimeAsSeconds());
		assertEquals("     4,800", time1.toString());
		assertEquals("    11,435", time.toString());
	}
	
	@Test
	void time2CanChangeTime() {
		Time2 time = new Time2(3, 10, 35);
		Time2 time1 = new Time2(1, 20);
		time.setHour(3);
		assertEquals(10800, time.getHour());
		time.setMinute(0);
		assertEquals(0, time.getMinute());
		assertEquals(10835, time.getTimeAsSeconds());
		
//		try {
//			time1.setSecond(60);
//		}catch(IllegalArgumentException e) {
//			e.getMessage();
//		}
//		assertEquals("Seconds should be between 0 - 59", time1.getSecond());
	}

}
