/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rishi Gadhia
 */

package baseline;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Solution41 {

    public static void main(String[] args) {

        List<String> names;
       names = sortArrayList();


        outputasFile(names);

    }

    private static void outputasFile(List<String> names) {
        // use try and catch, try (Formatter output = new  Formatter ("exercise41_output.txt"))
        try(Formatter output = new Formatter("data/exercise41_output.txt") ) {
            int val = 0;
            // once sorted we can iterate through the ArrayList and output the data in the file


            while(names.size() > val) {
                output.format("%n%s", names.get(val));
                val++;
            }
        }

        catch(FileNotFoundException | SecurityException | FormatterClosedException e ) {
            e.printStackTrace();
        }
    }

    private List<String> readData() {
        ArrayList<String > names = new ArrayList<>();
        // Read the list of names from a file called 'exercise41_input.txt'
        // use try and catch, try to scan Paths.get("exercise41_input.txt")

        try ( Scanner in = new Scanner(Paths.get("data/exercise41_input.txt"))) {

            // to read the file we can use the while loop (input.hasNext())
            while(in.hasNext()) {
                // store the input in an arraylist
                names.add(in.nextLine());
            }
        }

        catch(IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
        return names;
    }

    public static List<String> sortArrayList() {

        Solution41 app = new Solution41();
        List<String> names = app.readData();
        // To sort the name we can use the ArrayList function
        // Collections.sort can sort in alphabetical order
        Collections.sort(names);

        return names;
    }
}
