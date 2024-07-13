package JavaBasics;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Switch Case Statments in Java ");
        System.out.println("Enter your favourite Indian fruits name??");
        Scanner in = new Scanner(System.in);
        String fruits = in.next();
        int Day = in.nextInt();

        // switch (fruits) {
        // case "mango":
        // System.out.println("This is Mango most loved Indian Fruits");

        // break;
        // case "Grapes":
        // System.out.println("This is Grapes Small Indian Fruits");
        // break;
        // case "Banana":
        // System.out.println("This is Banana the protine rich Indian fruit");
        // break;

        // default:
        // System.out.println("Something is invalid here !!");
        // break;
        // }

        switch (fruits) {
            case "manogo" -> System.out.println("This is the Mango The Indian Fruit");
            case "Orange" -> System.out.println("This is the Orange Fruit");
            case "Banana" -> System.out.println("this is the banana rich protine fruit in india");
            case "Grapes" -> System.out.println("Small fruits of India called Grapes usually");
            default -> System.out.println("This is somthing invalid here :: ");

        }
        switch (Day) {
            case 1 , 2, 3, 4, 5 -> System.out.println("This is WeekDay");
            case 6, 7 -> System.out.println("this is the WeekEnd");
            default -> System.out.println("you are putting the number lessor or grater from 1 to 7");
            
        } // This is the upgraded systex of the switch cases in java 

        in.close();

    }
}
