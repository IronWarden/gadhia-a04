package baseline;

public class Replace {
    // takes a string from input as a parameter
    // we can replace "utilize" with "use" by using the string method replaceall and regex
    // then return the new string

    public String replaceWord(String word) {
        // replace "utilize" and "utilizes" with replaceall regex expression

        word = word.replaceAll("\\butilizes\\b", "uses");
        word = word.replaceAll("\\butilize\\b", "use");

        return word;

    }
}
