/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;


import java.util.List;

public class Solution42 {

    public static void main(String[] args) {

        // get input and store into an array of strings using class getInput
        Input input = new Input();
        List<String> employees;

        employees = input.getInput();

        // parse the data with my own parser class
        // return the new array

        MyParser parser = new MyParser();
        parser.parseList(employees);

        // output the file by iterating through the array
        // use format specifier %-10 to space
        // print out in stdoutput


    }

}
