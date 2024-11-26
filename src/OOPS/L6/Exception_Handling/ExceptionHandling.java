package OOPS.L6.Exception_Handling;

import java.security.Key;

public class ExceptionHandling {

    // What is Exception Handling in Java?
    // Exception Handling in Java is a mechanism that allows developers to handle
    // runtime errors (exceptions) in a controlled manner. It helps prevent the
    // program from crashing and ensures that the application behaves gracefully,
    // even in unexpected situations.

    // Key Benefits of Exception Handling:
    // Prevents Program Crashes: Catches errors and ensures the application doesn’t
    // stop abruptly.
    // Improves Debugging: Provides a way to handle and log errors for debugging.
    // Separates Error-Handling Logic: Makes the code cleaner by separating normal
    // logic from error-handling logic.

    // What does "exceptions must be handled" mean?
    // Java's philosophy is to encourage developers to write robust code that
    // accounts for potential problems.
    // Checked exceptions must be handled at compile time to ensure that the program
    // can respond to errors (like file not found) gracefully.
    // Unchecked exceptions don’t require handling, but it’s good practice to handle
    // them if they’re expected (e.g., null values, division by zero).

    public static void main(String[] args) {
        // Code without Exception Handling
        int a = 10;
        int b = 0;
        // System.out.println(a / b);

        // Code with Exception Handling
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Arithimetic Exception occurs");

        }

        // catch (Exception e) {
        // System.out.println("some Exception occurs here" +
        // e.getLocalizedMessage().toString());

        // }
        finally {
            System.out.println("Execution Completed Now");
        }

        checkAge(16);

    }


    // throw in Java
    // Purpose: Used to explicitly throw an exception.
    // Where it's Used: Inside a method or block of code.
    // Key Point: After throw, the program stops executing unless the exception is caught by a try-catch block.

    public static void checkAge(int age) {
        if(age < 18) {
            throw new IllegalArgumentException("Age in invalid") ; 
        }
        System.out.println("Age is Valid"); 
    }

    // throws in Java
    // Purpose: Declares exceptions a method might throw.
    // Where it's Used: In the method signature.
    // Key Point: It tells the caller of the method to handle the exception using try-catch or declare it further using throws.

}
