package baseline;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountFrequencyTest {
    @Test
    void test_if_data_is_mapped_correctly() {
        CountFrequency frequency = new CountFrequency();
        String input = "badger badger badger\n" +
                "badger mushroom\n" +
                "mushroom snake badger badger\n" +
                "badger";

        Map<String, Integer> map = new HashMap<>();

        map.put("badger", 7);
        map.put("mushroom", 2);
        map.put("snake", 1);
        Map<String, Integer> actualMap;
        actualMap = frequency.countWords(input);

        assertEquals(map,actualMap );
    }

}