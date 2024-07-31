package DSAlgo.Algo.BinarySearch.TwoDArrays;

import java.util.Arrays;

public class SearchInTwoArrayI {
    public static void main(String[] args) {
        // int[][] matrix = {
        // {10, 20, 30, 40},
        // {41, 42, 43, 44},
        // {45, 50, 52, 61},
        // };

        // Note :
        // if you are given a matrix which in entirly sorted (in which the last element
        // of the previous row is lesser then the first element of the next row) then
        // this solution will work but more optimised solution is there.

        // And if you have the row and col vise sorted array then this is the optimised
        // solution.
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        System.out.println(Arrays.toString(search(matrix, 43))); // should print [1,2]
        System.out.println(Arrays.toString(search(matrix, 44))); // should print [1,3]
        System.out.println(Arrays.toString(search(matrix, 10))); // should print [0,0]
        System.out.println(Arrays.toString(search(matrix, 49))); // should print [2,3]

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
