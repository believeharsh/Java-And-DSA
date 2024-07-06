import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Switch Case Statments in Java ");
        System.out.println("Enter your favourite Indian fruits name??");
        Scanner in = new Scanner(System.in);
        String fruits = in.next();

        switch (fruits) {
            case "mango":
                System.out.println("This is Mango most loved Indian Fruits");
            
                 
                break;
                case "Grapes":
                System.out.println("This is Grapes Small Indian Fruits");
                break ; 
                case "Banana" : 
                System.out.println("This is Banana the protine rich Indian fruit");
                break ; 
        
            default:
            System.out.println("Something is invalid here !!");
                break;
        }

        in.close();

        
    }
}
