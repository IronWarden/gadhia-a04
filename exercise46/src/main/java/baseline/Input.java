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
