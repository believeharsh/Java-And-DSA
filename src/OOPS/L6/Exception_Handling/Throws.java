package OOPS.L6.Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// There are two ways to handle exceptions in Java when a method declares a throws clause:

// 1. Using try-catch Block
// This is the most common way to handle exceptions directly within your code:

// Advantages:

// You handle the exception immediately at the point where it occurs.
// You can recover from the exception (e.g., prompt the user to provide another file name).


// 2. Propagate the Exception Using throws in the main Method
// You can declare the exception in the main method's signature:

// Advantages:

// Useful when you don't want to handle the exception in the current method.
// Lets higher-level methods (or the JVM) decide how to handle the exception.


public class Throws {
    public static void readFile(String fileName) throws FileNotFoundException {
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine().toString());
            }
        }
    }


    public static void main(String[] args) throws FileNotFoundException{
        // try {
        //     readFile("ExceptionHandling.java");
        // } catch (FileNotFoundException e) {
        //    System.out.println("file not found  " + e.getLocalizedMessage().toString());
        // }

        readFile("src\\OOPS\\L6\\Exception_Handling\\ExceptionHandling.java");
    }
}
