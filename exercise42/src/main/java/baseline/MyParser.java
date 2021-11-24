/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;



import java.util.List;

public class MyParser {
    // parse the data without using CSV parser


    public String[] parseList(List<String> employees) {

        int val = 0;

        String[] parsedEmployee = null;
        while(employees.size() > val) {
            // use the split method to split by the data by the comma
            String employee = employees.get(val);
            parsedEmployee = employee.split(",");


            // printing here is the simplest way
            System.out.println(parsedEmployee[0] + " " +
                    parsedEmployee[1] + " " +  " " + parsedEmployee[2]);
            val++;

        }
       // return the new array for testing
       return parsedEmployee;
    }



}
