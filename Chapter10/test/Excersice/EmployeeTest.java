package Excersice;
import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	private Logger logger = Logger.getLogger(Employee.class.getName());
	Date birthdate;
	Date birthdate2;
	Date birthdate3;
	Date birthdate4;
	Date birthdate5;
	Employee employee;
	Employee employee1;
	Employee employee2;
	Employee employee3;
	PieceWorker employee4;

	@BeforeEach
	void setUp() throws Exception {
		birthdate = new Date(10, 12, 2020);
		birthdate2 = new Date(12, 01, 1555);
		birthdate3 = new Date(10, 05, 2040);
		birthdate4 = new Date(10, 05, 1970);
		birthdate5 = new Date(02, 06, 1978);
		employee = new SalariedEmployee("Yemi", "Osho", "SHN145", birthdate, 1000);
		employee1 = new CommisionEmployee("Jide", "Ojo", "SHN355", birthdate2, 25000);
		employee2 = new BasePlusCommissionEmployee("Dele", "Adeogo", "SHN122", birthdate3, 12000, 500);
		employee3 = new HourlyEmployee("Shina", "Shitta", "SHN123", birthdate4, 200, 1.5, 42, 40);
		employee4 = new PieceWorker("John", "Wick", "SHN226", birthdate5, 100.0 );
	}

	@AfterEach
	void tearDown() throws Exception {
		employee = null;
		birthdate = null;
	}

	@Test
	void EmployeeHasBirthdatetest() {
		assertEquals("10-12-2020", employee.getBirthdate().toString());
		birthdate.setDay(15);
		birthdate.setMonth(10);
		birthdate.setYear(1905);
		assertEquals("15-10-1905", employee.getBirthdate().toString());
	}
	@Test
	void employeeSubClassTest() {
		assertEquals("10-5-2040", employee2.getBirthdate().toString());
		assertEquals(7500, employee1.getPayableAmount());
		System.out.println(employee2.toString());
		System.out.println(employee1.toString());
		assertEquals(4100, employee2.getPayableAmount());
		Date mydate = new Date(10,5,1932);
		CommisionEmployee comEmploy = new CommisionEmployee("Jide", "Ade", "SHN520", mydate, 24000);
		assertEquals(7200, comEmploy.getCommission());
	}
	@Test
	void employeeArrayTest() {
		Employee[] employeeArray = new Employee[4];
		Date mydate = new Date(10,5,1932);
		employeeArray[0] = employee;
		employeeArray[1] = employee1;
		employeeArray[2] = employee2;
		employeeArray[3] = employee3;
		
		for(Employee emp : employeeArray) {
			if(emp.getBirthdate().getMonth() == mydate.getMonth()) {
				double giftPlusSalary = emp.getPayableAmount() + 100;
				System.out.println(emp);
				System.out.println(giftPlusSalary);
			}
		}
			
	}
	@Test
	void employeeArrayObjectTest() {
		Employee[] employeeArray = new Employee[5];
		employeeArray[0] = employee;
		employeeArray[1] = employee1;
		employeeArray[2] = employee2;
		employeeArray[3] = employee3;
		employeeArray[4] = employee4;
		
		System.out.println(employee4.getWage());
		for(Employee emp : employeeArray) {
			 logger.info(emp.toString());
			 System.out.println(emp.getPayableAmount());
		}
	}
	
	@Test
	void interfaceTest() {
		Payable objHourly = new HourlyEmployee("Shina", "Shitta", "SHN123", birthdate4, 200, 1.5, 45, 40);
		Payable objSalaried = new SalariedEmployee("Yemi", "Osho", "SHN145", birthdate, 1500);
		Payable objCommision = new CommisionEmployee("Jide", "Ojo", "SHN355", birthdate2, 29000);
		Payable objBasePlus = new BasePlusCommissionEmployee("Tony", "Elumelu", "SHN325", birthdate3, 10000, 600);
		Payable invoice1 = new Invoice("Wheel Ring", "TVN222", 10, 300);
		Payable invoice2 = new Invoice("Toner Ink", "TVN311", 20, 200);
		assertNotNull(objHourly);
		Payable[] payableObj = new Payable[6];
		payableObj[0] = objHourly;
		payableObj[1] = objSalaried;
		payableObj[2] = invoice1;
		payableObj[3] = objCommision;
		payableObj[4] = objBasePlus;
		payableObj[5] = invoice2;
		
		
		for(Payable pay : payableObj) {
			if(pay == objBasePlus) {
				System.out.println(pay.getPayableAmount() + pay.getPayableAmount() * 0.1);
				assertEquals(3960, pay.getPayableAmount() + pay.getPayableAmount() * 0.1);
			}
			System.out.println(pay.getPayableAmount());
		}
		
	}
}
