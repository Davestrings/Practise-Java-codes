/**
 * 
 */
package accounts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import accounts.Account;

/**
 * @author USER
 *
 */
class AccountTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Account myAccount = new Account();
		myAccount.setBalance(10000.00);
		myAccount.setFirstName("Joshua");
		assertEquals(10000.00, myAccount.getBalance());
		assertNotNull(myAccount.getFirstName());
		assertEquals("Joshua", myAccount.getFirstName());
	}

}
