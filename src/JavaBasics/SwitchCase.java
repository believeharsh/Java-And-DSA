package JavaBasics;

import java.util.Scanner;

// ✅ Why No break Needed in Arrow Syntax?
// Because each case is a single expression or block, and Java automatically prevents fall-through.

// So there's no need for a break. It’s cleaner and safer.

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Switch Case Statements in Java ");
        System.out.println("Enter your favourite Indian fruit name (Mango, Orange, Banana, Grapes):");
        
        try (Scanner in = new Scanner(System.in)) {
            String fruits = in.next();  // reads only one word
            System.out.println("Enter day number (1-7):");
            int Day = in.nextInt();
            
            switch (fruits) {
                case "Mango" -> System.out.println("This is the Mango - The Indian Fruit");
                case "Orange" -> System.out.println("This is the Orange Fruit");
                case "Banana" -> System.out.println("This is the Banana - Rich protein fruit in India");
                case "Grapes" -> System.out.println("Small fruits of India called Grapes usually");
                default -> System.out.println("This is something invalid here.");
            }
            
            switch (Day) {
                case 1, 2, 3, 4, 5 -> System.out.println("This is a Weekday");
                case 6, 7 -> System.out.println("This is the Weekend");
                default -> System.out.println("You are entering a number outside 1 to 7");
            }
        } // reads only one word
    }
}
