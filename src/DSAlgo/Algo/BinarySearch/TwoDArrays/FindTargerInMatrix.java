package DSAlgo.Algo.BinarySearch.TwoDArrays;

import java.util.Arrays;

public class FindTargerInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {41, 42, 43, 44}, 
            {45, 50, 52, 61},
        };
        System.out.println(Arrays.toString(search(matrix, 43))); // should print [1,2]
        System.out.println(Arrays.toString(search(matrix, 44))); // should print [1,3]
        System.out.println(Arrays.toString(search(matrix, 10))); // should print [0,0]

    }

    public static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] { row, col };
            }
            ;
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }

}
