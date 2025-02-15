package day05.junittesting.basicjunit.filehandling;

import static org.junit.jupiter.api.Assertions.*;

import com.tit.week04.day05.junit.basicjunit.filehandling.FileHandling;
import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class FileHandlingTesting {

    private static final String TEST_FILE = "sample.txt";
    private FileHandling fileProcessor;

    @BeforeEach
    void setUp() {
        fileProcessor = new FileHandling();
    }

    @Test
    void testWriteAndReadFromFile() throws IOException {
        String content = "Hello, JUnit 5!";
        fileProcessor.writeToFile(TEST_FILE, content);

        String readContent = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent, "File content should match the written content.");
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Some content");
        assertTrue(Files.exists(Path.of(TEST_FILE)), "File should exist after writing.");
    }

}
