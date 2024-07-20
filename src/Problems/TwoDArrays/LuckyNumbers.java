package Problems.TwoDArrays;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {

    // Given an m x n matrix of distinct numbers, return all lucky numbers in the
    // matrix in any order.
    // A lucky number is an element of the matrix such that it is the minimum
    // element in its row and maximum in its column.

    public static void main(String[] args) {
        int[][] matrix = {
                { 7, 3, 8 },
                { 9, 11, 13 },
                { 17, 12, 15 }

        };

        System.out.println(luckyNumbers(matrix));
    }

    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int minRowVal = matrix[i][0];
            int minRowValind = 0;

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minRowVal) {
                    minRowVal = matrix[i][j];
                    minRowValind = j;
                }
            }

            boolean islucky = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minRowValind] > minRowVal) {
                    islucky = false;
                    break;
                }
            }
            if (islucky) {
                luckyNumbers.add(minRowVal);
            }
        }
        return luckyNumbers;
    }

}
