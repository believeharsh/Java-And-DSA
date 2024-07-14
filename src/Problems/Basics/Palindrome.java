package SimpleProblems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome Problem");
        Scanner in = new Scanner(System.in);
        System.out.println("Write the Number for checking the palindrome !!");

        int num = in.nextInt();
        int originalnum = num ;
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            ans = ans * 10 + rem;

        }
        if (ans == originalnum) {
            System.out.println("Yes This is the Palindrome Number");
        }
        else{
            System.out.println("This is not the palindrome number");
        }
        in.close();
    }
  

}
