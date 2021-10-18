package baseline;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {
    @Test
    void test_if_input_is_take_correctly() {
        Input input = new Input();
        String actual = input.getInput();

        String expected = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\".";

        assertEquals(expected, actual);
    }

}