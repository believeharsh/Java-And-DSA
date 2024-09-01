package Basics.PatternPrinting;

public class Printing {
    public static void main(String[] args) {
        pattern5(4);
        // pattern6(4);
    }

    // pattern1 ;
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // pattern number 2
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // pattern 3
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // patter 4
    // 1
    // 1 , 2
    // 1, 2, 3,
    // 1, 2, 3, 4
    // 1, 2, 3, 4, 5
    // 1, 2, 3, 4
    // 1, 2, 3
    // 1, 2
    // 1

    static void pattern4(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 5 ;
    static void pattern5(int n) {
        int originalN = n;
        n = 2 * n;
    
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
    
                // Check if the value is 0, and if so, print a space instead
                if (atEveryIndex != 0) {
                    System.out.print(atEveryIndex + " ");
                } else {
                    System.out.print("  "); // Print space for alignment
                }
            }
            System.out.println();
        }
    }

    // Pattern 6 ;
    static void pattern6(int n) {

        n = 2 * n;

        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
