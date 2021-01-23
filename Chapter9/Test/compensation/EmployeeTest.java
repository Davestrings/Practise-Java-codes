package compensation;

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
	void constructorTest() {
		CommissionModel comp = new CommissionCompensationModel(25000, 0.1);
		CommissionCompensationModel compense = new BasePlusCommissionCompensationModel(50000, 0.2, 1000);
		
		Employee john = new Employee("Joe", "Jenny", "002", comp);
	}
	@Test
	void employeeTest() {
		
	}

}
