package baseline;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class OutputTest {
    @Test
    void test_if_the_output_file_is_created() {
        String data = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".";
        String name = "test";
        Output output = new Output();
        output.outputFile(data, name);

        Path path = Paths.get("data/test.txt");
        assertTrue(Files.exists(path));

    }

}