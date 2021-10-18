/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;

public class Solution43 {
    public static void main(String[] args) {
        // create a class for all prompts called promptUser
        PromptUser prompt = new PromptUser();
        String siteName = prompt.promptName();
        String authorName = prompt.promptAuthor();
        String jsFolder = prompt.askJSFolder();
        String cssFolder = prompt.askCSSFolder();


        // class to generate the index.html file
        GenerateFiles generateFiles = new GenerateFiles();
        generateFiles.generateIndexFile(siteName, authorName);
        // if user wants jsFolder
        if(jsFolder.equals("y")) {
            generateFiles.generatejsFolder();
        }
        // if the user wants cssFolder
        if(cssFolder.equals("y")) {
            generateFiles.generatecssFolder();
        }

        // output class to output only what the user specifies in the input in stdoutput
        Output output = new Output();
        output.outputcreatedFiles(jsFolder, cssFolder);

    }








}
