/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rishi Gadhia
 */

package baseline;


import java.util.Map;

public class Solution46 {
    public static void main(String[] args) {
        // create an input class to read the dat a
         String word;
         Input input = new Input();
         word = input.getInput();

        // create a class to count the frequency of each word
        Map<String, Integer> count;
        CountFrequency countFrequency = new CountFrequency();

        count = countFrequency.countWords(word);

        // create a class to output the frequency in *
        Output output = new Output();
        output.stdOutput(count);

    }
}
