package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {
    @Test
    void test_if_input_is_taken_correctly() {
        Input input = new Input();
        String actual = input.getInput();
        String  expected = "badger badger badger\n" +
                "badger mushroom\n" +
                "mushroom snake badger badger\n" +
                "badger";

        assertEquals(expected, actual);
    }

}