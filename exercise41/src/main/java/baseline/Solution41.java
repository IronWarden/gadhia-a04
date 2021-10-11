/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rishi Gadhia
 */

package baseline;

import java.util.ArrayList;

public class Solution41 {
    public static void main(String[] args) {
        readData();
        // Read the list of names from a file called 'exercise41_input.txt'
        // use try and catch, try to scan Paths.get("exercise41_input.txt")
        // catch IO“IOException | NoSuchElementException | IllegalStateException e) {
        // e.printStackTrace();”


        // to read the file we can use the while loop (input.hasNext())
        // store the input into an ArrayList



       // To sort the name we can use the ArrayList function
        // Collections.sort can sort in alphabetical order
        sortArrayList();


        outputasFile();
        // output as `exercise41_output.txt`
        // use try and catch, try (Formatter output = new  Formatter ("exercise41_output.txt"))
        // catch “SecurityException | FileNotFoundException |FormatterClosedException e) {
        //  e.printStackTrace
        // once sorted we can iterate through the ArrayList and output the data in the file
    }

    private void outputasFile() {
    }

    private void readData() {
    }

    private ArrayList sortArrayList() {

    }


}
