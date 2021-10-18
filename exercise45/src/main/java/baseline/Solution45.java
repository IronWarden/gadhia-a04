/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rishi Gadhia
 */

package baseline;

import java.util.Scanner;

public class Solution45 {

    public static void main(String[] args) {
          Scanner stdin = new Scanner(System.in);
          // use the input class to take input from the txt file
          Input input = new Input();
          String word = input.getInput();

          // use the replace class to replace "utilize" with "use"
          Replace replace = new Replace();
          word = replace.replaceWord(word);

        // promptUser for the name of the file
        System.out.println("What is the name of the file? ");
        String name = stdin.nextLine();

        // use the class output to take input of the name of the file and create the file
        Output output = new Output();
        output.outputFile(word, name);
    }
}
