package chapter_8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EnumSet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void enumTest() {
		for(Book book : Book.values())
			System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
	}
	@Test
	 void enumRangeTest() {
		System.out.println("\nDisplay a range of enum constants\n");
		for(Book book : EnumSet.range(Book.CHTP, Book.VBHTP))
			System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
	}

}
