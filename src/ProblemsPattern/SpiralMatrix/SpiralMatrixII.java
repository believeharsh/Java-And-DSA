package ProblemsPattern.SpiralMatrix;

import java.util.Arrays;
// Problem link : https://leetcode.com/problems/spiral-matrix-ii/

public class SpiralMatrixII {
    public static void main(String[] args){
        int[][] result = generateMatrix(9);
        System.out.println(Arrays.deepToString(result));
    }
    public static int[][] generateMatrix(int n) {
        // Time Complexity : O (n * n)
        // space Complexity : O (n * n)
        // int[][] matrix = generateMatrixfirst(n);
                // here question is stating that you have to return the matrix from 1 to n square but if questin would say that form n to n square then we can call the function first. 

        // Spiral order logic
        int[][] result = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int value = 1;
    

        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                result[top][i] = value++;
            }
            top++;

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                result[i][right] = value++;
            }
            right--;

            if (top <= bottom) {
                // Traverse from right to left along the bottom row
                for (int i = right; i >= left; i--) {
                    result[bottom][i] = value++;
                }
                bottom--;
            }

            if (left <= right) {
                // Traverse from bottom to top along the left column
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = value++;
                }
                left++;
            }
        }

        return result;
    }
    public static int[][] generateMatrixfirst(int n) {
        int[][] matrix = new int[n][n];

        // Optional: Initialize the matrix with values
        int value = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = value++;
            }
        }

        return matrix;
    }
}
