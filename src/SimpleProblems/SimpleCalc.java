package SimpleProblems;

import java.util.Scanner;

public class SimpleCalc {
    // NOTE 
    // Simple program like this makes you comfortable on using loops and how they actually behave in the code
    public static void main(String[] args) {
        System.out.println("Simple Calculator program in java");
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter the operator first");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter Two Numbers for the operation");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }

                }

            }else if (op == 'x' || op == 'X') {
                break ; 
            } else {
                System.out.println("invalid operation ");
            }
            System.out.println("The Answer is " + ans);

        } 
        in.close();
    }

}
