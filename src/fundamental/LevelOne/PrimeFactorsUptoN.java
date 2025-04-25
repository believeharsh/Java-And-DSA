package fundamental.LevelOne;

import java.util.Scanner;

public class PrimeFactorsUptoN {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Prime factors of " + n + " are: ");
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                // Check if i is a prime factor
                System.out.print(i + " ");
                // Remove all occurrences of this prime factor
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        // If n is still greater than 1, then it is prime
        if (n > 1) {
            System.out.print(n);
        }

        sc.close();
    }
}
