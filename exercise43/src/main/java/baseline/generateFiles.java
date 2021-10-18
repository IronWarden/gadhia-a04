package baseline;


import java.io.File;
import java.io.IOException;
import java.util.Formatter;

public class GenerateFiles {
    // create the files specified by the input
    // to create files we can use Formatter like in the book

    String path = "data/";

    public void generateIndexFile(String siteName, String authorName) {
        // use try and catch
        try {

            Formatter output = new Formatter(path + "index.html");
            // create index.html file
            output.format("<!DOCTYPE html>%n<html lang=\"en\">%n<head>%n");
            output.format("<meta author=%s>%n", authorName);
            output.format("<title>%s</title>%n", siteName);
            output.format("</head>%n<body>%n</body>%n</html>");
            output.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    // method to generate jsFolder
    public void generatejsFolder() {
        new File(path +"js").mkdir();
    }
    // method to generate cssFolder
    public void generatecssFolder() {
        new File(path +"css").mkdir();
    }
}
