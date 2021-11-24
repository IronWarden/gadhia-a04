/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyParserTest {
    @Test
    void test_if_the_parser_works() {
        MyParser parser = new MyParser();
        List<String> expectedEmployees = new ArrayList<>();
        String[] actualEmployees;
        expectedEmployees.add("Ling,Mai,55900");


        actualEmployees = parser.parseList(expectedEmployees);
        String expected = "Ling";

        assertEquals(expected, actualEmployees[0]);
    }

}