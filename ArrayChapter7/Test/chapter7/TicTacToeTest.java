package chapter7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class TicTacToeTest {
	@Rule
	public ExpectedException exception = ExpectedException.none();
	private TicTacToe ticTacToe;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ticTacToe = new TicTacToe();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void whenXOutsideBoardThenRuntimeExceptionTest() {
		exception.expect(RuntimeException.class);
		ticTacToe.play(5, 2);
	}

}
