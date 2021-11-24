/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rishi Gadhia
 */

package baseline;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Input {
    // take the input from the file using try and catch
    // store each word in an arraylist
    // return the arraylist
    public String getInput() {

        String input;
        try(Scanner in = new Scanner(Paths.get("data/exercise46_input.txt")).useDelimiter("\\A")) {
            input = in.next();
            return input;
        }

        catch(IOException e) {
        e.printStackTrace();
    }
    return null;
    }
}
