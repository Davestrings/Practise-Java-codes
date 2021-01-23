package file;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws IOException{
		String thePath = "C:\\Users\\USER\\Desktop\\javaPrograms\\javaBookPrograms\\Chapter15";
		
		Path path = Paths.get(thePath);
		assertTrue(Files.isDirectory(path));
		assertTrue(Files.exists(path));
		assertTrue(path.isAbsolute());
		
		DirectoryStream<Path> dir = Files.newDirectoryStream(path);
		for(Path p : dir) {
			System.out.println(p);
		}
	
	}
	@Test
	void openFileTest() {
		String outpath = "C:\\Users\\USER\\Desktop\\javaPrograms\\javaBookPrograms\\Chapter15\\clients.txt";
		
		Path path = Paths.get(outpath);
		assertTrue(Files.exists(path)
		
	}

}
