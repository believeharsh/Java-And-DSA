import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Calculate the sum
        double sum = number1 + number2;

        // Display the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
    }
}