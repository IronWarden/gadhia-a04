package baseline;

import java.io.IOException;
import java.util.Formatter;

public class Output {
    // takes the new string, file name and outputs it in a new file in data folder
    // use try and catch with formatter

    public void outputFile(String data, String name) {
        try (Formatter output = new Formatter("data/"+name+".txt")) {
            output.format(data);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
