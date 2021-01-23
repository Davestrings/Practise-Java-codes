package TurtleRefactored;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TurtleTest {
	SketchPad mySketchPad;
	Turtle  myTurtle;
	@BeforeEach
	void setUp() throws Exception {
		mySketchPad = new SketchPad();
		myTurtle = new Turtle();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
