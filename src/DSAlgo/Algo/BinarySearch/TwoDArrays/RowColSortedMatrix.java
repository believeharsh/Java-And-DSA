package DSAlgo.Algo.BinarySearch.TwoDArrays;

import java.util.Arrays;

// Here if we given a matrix that is sorted row wise and column wise, that means each row will be sorted, and each column will be sorted, like you can see in the example ; 

// 📘 Notes: Searching in a Row-Column Sorted Matrix
// ✅ Problem Statement
// You are given a 2D matrix where:

// Each row is sorted in ascending order from left to right.

// Each column is sorted in ascending order from top to bottom.

// Goal: Find the position of a target value in the matrix (return its row and column index), or [-1, -1] if not found.

// ✅ Strategy (Optimized Search)
// We start from the top-right corner of the matrix and narrow our search by using the matrix's properties.

// Why top-right?
// Because:

// It's the maximum value in the first row.

// From there:

// Go left → smaller values

// Go down → larger values

// 🧠 Intuition Behind the Search
// Let r = 0, c = matrix[0].length - 1 (top-right element).

// Now:

// If matrix[r][c] == target: 🎯 We found it.

// If matrix[r][c] < target: The current element is too small → move down to a larger row (r++).

// If matrix[r][c] > target: The current element is too big → move left to a smaller column (c--).

// Repeat until:

// You find the target

// Or you move outside the matrix (r >= rows || c < 0)

public class RowColSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }

        };

        System.out.println(Arrays.toString(search(arr, 37)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[] { r, c };
            } else if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 };
    }
}
