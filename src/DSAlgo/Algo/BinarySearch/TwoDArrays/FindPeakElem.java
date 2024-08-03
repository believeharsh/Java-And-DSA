package DSAlgo.Algo.BinarySearch.TwoDArrays;

// problem link : https://leetcode.com/problems/find-a-peak-element-ii/

// Note : before jumping on the solution, we should understand the problem properly that what exactly problem is stating

import java.util.Arrays;

public class FindPeakElem {
    public static void main(String[] args) {
         int[][][] testCases = {
            {
                {10, 8, 10, 10},
                {14, 13, 12, 11},
                {15, 9, 11, 21},
                {16, 17, 19, 20}
            },
            {
                {10, 20, 15},
                {21, 30, 14},
                {7, 16, 32}
            },
            {
                {10, 7, 8, 15},
                {21, 10, 14, 12},
                {7, 12, 10, 32},
                {5, 10, 11, 14}
            }
        };

        for (int[][] mat : testCases) {
            int[] peak = findPeak(mat);
            System.out.println("Peak element at: " + Arrays.toString(peak));
        }

    }

    public static int[] findPeak(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int maxrow = 0;
            // find the max element in the middle column ;
            for (int i = 0; i < m; i++) {
                if (mat[i][mid] > mat[maxrow][mid]) {
                    maxrow = i;
                }
            }
            // since we already know that if the element is one the boundry of the matrix
            // then it's neighbours will be
            // smaller (-1) ;
            boolean isLeftSmaller = (mid == 0) || (mat[maxrow][mid] > mat[maxrow][mid - 1]);
            boolean isRightSmaller = (mid == n - 1) || (mat[maxrow][mid] > mat[maxrow][mid + 1]);

            if (isLeftSmaller && isRightSmaller) {
                return new int[] { maxrow, mid };
            } else if (mid > 0 && mat[maxrow][mid - 1] > mat[maxrow][mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return new int[] { -1, -1 };
    }

}
