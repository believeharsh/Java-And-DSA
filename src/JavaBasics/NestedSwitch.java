package JavaBasics;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter Employee ID: ");
            int empId = in.nextInt();
            in.nextLine(); // Consume leftover newline
            System.out.print("Enter Department (IT or Management): ");
            String department = in.nextLine();
            switch (empId) {
                case 1 -> System.out.println("Employee ID 1: Harsh");
                case 2 -> System.out.println("Employee ID 2: Mohit");
                case 3 -> {
                    System.out.println("Employee ID 3 selected");
                    switch (department) {
                        case "IT" -> System.out.println("Department is IT");

                        case "Management" -> System.out.println("Department is Management");

                        default -> System.out.println("Invalid department");
                    }
                }
                default -> System.out.println("Invalid Employee ID");
            }
            // good practice to close Scanner
        }
    }
}
