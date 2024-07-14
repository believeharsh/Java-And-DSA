package Problems.Basics;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        System.out.println("Largest Number Chacker Program");

        System.out.println("Enter three Number to check the Largest Numbers");
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;
        if (b > max) {
            max = b;

        }
        if (c > max) {
            max = c;
        }

        System.out.println("Maximum Number is " + max);
    }
}