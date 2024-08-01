package DSAlgo.Algo.BinarySearch.TwoDArrays;
// problem link : https://leetcode.com/problems/search-a-2d-matrix/

public class SearchInTwoArrayII {
    public static void main(String[] args) {
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 41, 42, 43, 44 },
                { 45, 50, 52, 61 },
                { 62, 65, 70, 71 }
        };
        int target = 70; //
        System.out.println((searchMatrix(matrix, target)));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int mid_val = matrix[mid / n][mid % n];

            if (mid_val == target)
                return true;
            else if (mid_val < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;

    }

}
