package Problems.TwoDArrays;

import java.util.Arrays;

public class FindValidMatrix {
    public static void main(String[] args) {
        int[] rowsum = { 5, 7, 8 };
        int[] colsum = { 8, 6, 8 };
        System.out.println(Arrays.deepToString(restoreMatrix(rowsum, colsum)));

    }

    // static int[][] restoreMatrix(int[] rowsum, int[] colsum) {
    //     int rows = rowsum.length;
    //     int cols = colsum.length;

    //     int[][] result = new int[rows][cols];
    //     System.out.println(result);

    //     for (int i = 0; i < rows; i++) {
    //         for (int j = 0; j < cols; j++) {
    //             result[i][j] = Math.min(rowsum[i], colsum[j]);
    //             rowsum[i] -= result[i][j];
    //             colsum[j] -= result[i][j];
    //         }

    //     }

    //     return result;
    // }

    public static int[][] restoreMatrix(int[] r, int[] c) {
        int m = r.length;
        int n = c.length;
        int[][] a = new int[m][n];
        int i = m-1;
        int j = n-1;
        while(i >= 0 && j >= 0){
            if(r[i] <= c[j]){
                System.out.println(r[i] <= c[j]);
                a[i][j] = r[i];
                c[j] -= r[i];
                i--;
            }
            else {
                a[i][j] = c[j];
                r[i] -= c[j];
                j--;
            }
        }
        return a;
}
}