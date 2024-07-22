package Practice;

import java.util.Arrays;

public class FindValidMatrix {

    public static void main(String[] args) {
        // int[] rowsum = {3, 8} ;
        // int[] colsum = {4, 7} ;
        int[] rowsum = { 5, 7, 10 }; // 
        int[] colsum = { 8, 6, 8 };

        System.out.println(Arrays.deepToString(getMatrix(rowsum, colsum)));
    }

    // First Approach :

    // static int[][] getMatrix(int[] rowsum, int[] colsum) {
    //     int rows = rowsum.length;
    //     int cols = colsum.length;
    //     int[][] res = new int[rows][cols];

    //     for (int i = 0; i < rows; i++) {
    //         for (int j = 0; j < cols; j++) {
    //             res[i][j] = Math.min(rowsum[i], colsum[j]);
    //             rowsum[i] -= res[i][j];
    //             colsum[j] -= res[i][j];
    //         }
    //     }
    //     return res;

    // }

    // Second approach

//   static int[][] getMatrix(int[] row, int[] col) {
//         int n = row.length;
//         int m = col.length;
//         int[][] mat = new int[n][m];
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 int min = row[i];
//                 if(col[j]<min) min = col[j];
//                 if(min>0) {
//                     mat[i][j] = min;
//                     row[i] -= min;
//                     col[j] -= min;
//                 }
//             }
//         }
//         return mat;
//     }


    // Third Approach 

    static int[][] getMatrix(int[] rowsum , int[] colsum){
        int rows = rowsum.length ; 
        int cols = colsum.length ; 
        int [][] res = new int[rows][cols] ; 

        int i = rows - 1 ; 
        int j = cols - 1 ; 
        while (i >= 0 && j >= 0) {
            int min = rowsum[i] ; 
            if(rowsum[i] <= colsum[j]){
                res[i][j] = rowsum[i] ; 
     
                colsum[j] -= res[i][j] ; 
                i-- ; 
            } else{
                res[i][j] = colsum[j];
                rowsum[i] -= colsum[j] ; 
                j-- ; 

            }
        }
        return res ; 
    }
}