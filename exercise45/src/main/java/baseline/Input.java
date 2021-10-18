package baseline;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;


public class Input {
    // takes input and stores it as a string using try and catch
    public String getInput() {
        String input = null;
        // useDelimiter //A to take the input into one string
        try (Scanner in = new Scanner(Paths.get("data/exercise45_input.txt")).useDelimiter("\\A")) {
            input = in.next();
            return input;
        }
        // catch an IOException
        catch(IOException e) {
            e.printStackTrace();
        }

       return null;
    }
}
