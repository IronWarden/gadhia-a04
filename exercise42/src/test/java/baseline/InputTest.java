/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {
    @Test
    void testing_reading_file() {
        Input input = new Input();
        List<String> employees = input.getInput();
        List<String> expectedEmployees = new ArrayList<>();
        expectedEmployees.add("Ling,Mai,55900");
        expectedEmployees.add("Johnson,Jim,56500");
        expectedEmployees.add("Jones,Aaron,46000");
        expectedEmployees.add("Jones,Chris,34500");
        expectedEmployees.add("Swift,Geoffrey,14200");
        expectedEmployees.add("Xiong,Fong,65000");
        expectedEmployees.add("Zarnecki,Sabrina,51500");

        assertEquals(expectedEmployees, employees);
    }

}