/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input {
    // using the try and catch method to read the data and store it into an array of strings

    public List<String> getInput() {
        List<String> employees = new ArrayList<>();

        try(Scanner input = new Scanner (Paths.get("data/exercise42_input.txt"))) {
            while(input.hasNext()) {
                // store the employee as a string
                employees.add(input.nextLine());

            }
        }
        // throw an exception for incorrect uses
        catch(IOException| NoSuchElementException| IllegalStateException e) {
            e.printStackTrace();
        }
        return employees;
    }

}
