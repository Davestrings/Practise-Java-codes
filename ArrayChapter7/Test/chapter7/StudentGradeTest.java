package chapter7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentGradeTest {
	StudentGrade studentGrade;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		studentGrade = new StudentGrade();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void constructorNotNullTest() {
		assertNotNull(studentGrade);
	}

	@Test
	void arrayCanTakeScoresTest() {
		int[] arrayOfGrades = {2, 45, 8, 0, 20};
		studentGrade.setStudentGrade(arrayOfGrades);
		//studentGrade.getStudentGrade();
		assertNotNull(studentGrade.getStudentGrade());
		assertEquals( 8,  studentGrade.getStudentGrade()[2]);
		assertEquals(20, studentGrade.getStudentGrade()[4]);
		
	}
	
	@Test
	void studentGradeSumTest() {
		assertEquals(39, studentGrade.addGrades());
	}
	
	@Test
	void studentGradeAverageTest() {
		studentGrade.getAverage();
		assertEquals(7.8, studentGrade.getAverage());
	}
	@Test
	void studentGradeMaxScoreTest() {
		int[] arrayOfGrades = {2, 45, 8, 0, 20};
		studentGrade.setStudentGrade(arrayOfGrades);
		assertEquals(45, studentGrade.maxScore());
	}
	@Test
	void studentGradeMinScoreTest() {
		int[] arrayOfGrades = {2, 45, 8, 0, 20};
		studentGrade.setStudentGrade(arrayOfGrades);
		assertEquals(0, studentGrade.minScore());
	}

}
