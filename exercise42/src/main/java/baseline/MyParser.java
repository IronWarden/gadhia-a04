package baseline;


import java.util.List;

public class MyParser {
    // parse the data without using CSV parser
    // use the split method to split by the data by the comma
    // return the new array
    public String[] parseList(List<String> employees) {

        int val = 0;
        String[] parsedList = new String[100];
        while(employees.size() > val) {

            String employee = employees.get(val);
            parsedList = employee.split(",");
            val++;

        }

       return parsedList;
    }



}
