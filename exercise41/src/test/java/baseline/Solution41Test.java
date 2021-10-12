package baseline;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {
    @Test
     void test_sorting() {

        ArrayList<String> testNames = new ArrayList<>();
        testNames.add("Johnson, Jim");
        testNames.add("Jones, Aaron");
        testNames.add("Jones, Chris");
        testNames.add("Ling, Mai");
        testNames.add("Swift, Geoffrey");
        testNames.add("Xiong, Fong");
        testNames.add("Zarnecki, Sabrina");
        List<String> names = Solution41.sortArrayList();

        assertEquals(testNames, names);


    }

}