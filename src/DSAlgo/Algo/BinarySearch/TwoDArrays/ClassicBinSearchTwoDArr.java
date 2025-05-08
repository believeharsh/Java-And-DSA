package DSAlgo.Algo.BinarySearch.TwoDArrays;

public class ClassicBinSearchTwoDArr {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };

        int target = 16;

        boolean found = searchMatrix(matrix, target);
        System.out.println("Target found: " + found);
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / cols][mid % cols];
            // why?
            // mid / cols gives you how many complete rows are there before mid.
            // mid % cols gives you the column index in that row.

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    static boolean searchMatrixApproachB(int[][] matrix, int target) {
        int rows = matrix.length ; 
        int cols = matrix[0].length ; 

        if(rows == 1 ) {
            
        }
    }


}
