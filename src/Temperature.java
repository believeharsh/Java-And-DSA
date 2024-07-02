import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Calcious to Farenhite Converter **");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter temperature in Calcious : ");
        float Tempc = input.nextFloat();
        float TempF = (Tempc * 9/5) + 32 ; 
        System.out.println("Temperature in Farenhite = " + TempF);

    }
}
