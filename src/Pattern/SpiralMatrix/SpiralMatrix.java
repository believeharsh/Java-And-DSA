package Pattern.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;
// Problem Link : https://leetcode.com/problems/spiral-matrix/

public class SpiralMatrix {
    // Time Complexity  : O(m * n) since each element is exactly proccessed once. 
    // Space complexity : O(m * n ) since result is directly proportional to the number of elements in the matrix, which is m * n
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 4, 6, 7},
            {1, 2, 9, 0}, 
            {1, 4, 6, 2},
            {2, 4, 2, 4},
            {9, 1, 4, 6}
        };

        System.out.println(spiralOrder(matrix)) ; 

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        ;

        return result;

    }
}