/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;

import java.util.Scanner;

public class PromptUser {
    public static final Scanner in = new Scanner(System.in);
    // prompt the name of the site
    // prompt the author of the site
    //Ask if the user wants a folder for JavaScript files.
    // Ask if the user wants a folder for CSS files.
     public String promptName() {
         System.out.println("Site name: ");
         return in.nextLine();
     }
     public String promptAuthor() {
         System.out.println("Author: ");
         return in.nextLine();
     }
     public String askJSFolder() {
         System.out.println("Do you want a folder for JavaScript?");
         return in.nextLine();
     }
     public String askCSSFolder() {
         System.out.println("Do you want a folder for CSS? ");
         return in.nextLine();
     }

}
