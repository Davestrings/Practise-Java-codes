package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.StringTokenizer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void stringBuilderTest() {
		StringBuilder nameBuilder = new StringBuilder();
		nameBuilder.append("Tolu");
		nameBuilder.append(" ");
		nameBuilder.append("Ayemobola");
		
		assertEquals("Tolu Ayemobola", nameBuilder.toString());
	}
	@Test
	void regExmatchingTest() {
		String pattern = "[aeiou]";
		String theExpression = "aeiou";
		assertTrue(theExpression.matches(pattern));
	}

}
