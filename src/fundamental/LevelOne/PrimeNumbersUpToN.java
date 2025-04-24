package fundamental.LevelOne;

import java.util.Arrays;

public class PrimeNumbersUpToN {
    public static void main(String[] args) {
        int n = 50; // You can change this value
        sieveOfEratosthenes(n);
    }

    static void sieveOfEratosthenes(int n) {
        // Step 1: Create a boolean array "isPrime[0..n]" and initialize all entries as
        // true
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime numbers
        isPrime[0] = false;
        isPrime[1] = false;

        // Step 2: Start checking from 2 (the first prime)
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // Step 3: Mark all multiples of i as false
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 4: Print all prime numbers
        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
