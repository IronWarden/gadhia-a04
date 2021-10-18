package baseline;

public class Output {
    // print output only for the files that were created
    // takes the input and prints out the files created
    // since the location of the file is known when writing it we can print out
    // each directory and use if conditions to output the proper js and/or css folders

    public void outputcreatedFiles(String jsFolder, String cssFolder) {
        String path = "Created ./data/";

        System.out.println(path + "index.html");


        if(jsFolder.equals("y")) {
            System.out.println(path + "js/");

        }

        if(cssFolder.equals("y")) {
            System.out.println(path + "css/");
        }


    }


}
