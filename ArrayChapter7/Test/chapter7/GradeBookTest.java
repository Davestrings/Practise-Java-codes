package chapter7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook myClassGrade;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		int[][] myGrade = new int[10][3];
		myClassGrade = new GradeBook("Chemistry", myGrade);
	}

	@AfterEach
	void tearDown() throws Exception {
		int[][] myGrade = new int[2][3];
		myClassGrade = new GradeBook("Chemistry", myGrade);
		int highGrade = myGrade[0][0];
	}

	@Test
	void Constructortest() {
		
		assertEquals("Chemistry", myClassGrade.getCourseName());
//		assertEquals(0, myClassGrade.getGrade());
		myClassGrade = new GradeBook();
		assertEquals("Chemistry", myClassGrade.getCourseName());
	}
	
	@Test
	void processGradeTest() {
		
	}
	@Test
	void OutputGradesTest() {
		
	}
	@Test
	void MaximnumTest() {
		
	}

}
