package chapter7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void employeeConstructorTest() {
		Employee jenny = new Employee();
		assertNotNull(new Employee());
		Employee john = new Employee("John", "Doe"+1);
	}
	@Test
	void dateTest() {
		Date today = new Date();
		try {
			assertNotNull(new Date(33, 12, 2019));
		}catch (IllegalArgumentException ex){
			ex.getMessage();
		}
		
	}
	
	@Test
	void employeeTest() {
		Employee jenny = new Employee();
		jenny.setFirstName("john");
		assertEquals("john", jenny.getFirstName());
		jenny.setLastName("Toni");
		assertEquals("Toni", jenny.getLastName());
		
		Date birth = new Date(10, 12, 1994);
		Date hire = new Date(11, 06, 2018);
		assertNotNull(new Employee("Tolu", "Ayemobola", birth, hire));
		Employee james = new Employee("James", "Omoniyi", birth, hire);
		System.out.println(james);
		james.setMinWage(1000);
		assertEquals(1000, james.getMinWage());
		
	}
	@Test
	void objectStaticCallTest() {
		//This test is to confirm that an an object can manipulate a static (class) variable and a second object get that same value.
		Employee jenny = new Employee();
		Employee.setMinWage(1000);
		assertEquals(1000, Employee.getMinWage());
		Employee.setMinWage(2000);
		assertEquals(2000, jenny.getMinWage());
		
		Date birth = new Date(10, 12, 1994);
		Date hire = new Date(11, 06, 2018);
		Employee james = new Employee("James", "Omoniyi", birth, hire);
		assertEquals(2000, james.getMinWage());
		assertEquals(2000, Employee.getMinWage());
	}

}
