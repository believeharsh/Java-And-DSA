package DSAlgo.Recursion;

public class PatternPrintRec {
    public static void main(String[] args) {
        // TriangleReverse(10, 0);
        TriangleNormal(10, 0) ; 
    }

    static void TriangleReverse(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            System.out.print("*");
            TriangleReverse(row, col + 1);
        } else {
            System.out.println();
            TriangleReverse(row - 1, 0);
        }
    }

    static void TriangleNormal(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {

            TriangleNormal(row, col + 1);
            System.out.print("*");
        } else {

            TriangleNormal(row - 1, 0);
            System.out.println();
        }
    }
}