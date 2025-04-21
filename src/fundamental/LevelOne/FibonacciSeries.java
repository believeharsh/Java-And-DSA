package fundamental.LevelOne;

public class FibonacciSeries {
    public static void main(String[] args) {
        generateFibonacci(50);  // Example: Generate Fibonacci numbers ≤ 50
    }

    static void generateFibonacci(int limit) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series up to " + limit + ": ");

        // while (a <= limit) {
        //     System.out.print(a + " ");
        //     int next = a + b;
        //     a = b;
        //     b = next;
        // }

        // for( ; a <= limit ; ){
        //     System.out.print(a + " ");
        //     int next = a + b ; 
        //     a = b ; 
        //     b = next ; 
        // }

        
        // Loop to print the first `n` Fibonacci numbers
        for (int i = 1; i <= limit; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println(); // For newline after printing
    }
}