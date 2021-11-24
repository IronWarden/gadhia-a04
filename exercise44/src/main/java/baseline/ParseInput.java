/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rishi Gadhia
 */

package baseline;


import com.google.gson.Gson;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ParseInput {
    // use try and catch to read the json file
    // utilize the JSON parser to parse the data
    // parse the JSON string into a Gson object
    // use .getasString to get the object as a string

    public Product parseInput() {
        Gson gson = new Gson();
        Product product = new Product();
        try(Reader reader = new FileReader("data/exercise44_input.json")) {
            product = gson.fromJson(reader, Product.class);

            System.out.println(product.getName());
            return product;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return product;

    }
}
