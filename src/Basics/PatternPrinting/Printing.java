package Basics.PatternPrinting;

public class Printing {
    public static void main(String[] args) {
        pattern4(5);
       
    };

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
            for (int j = 1; j <= i ; j++) {
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
            int totalColsInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
