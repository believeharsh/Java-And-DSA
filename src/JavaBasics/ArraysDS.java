package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        
        // Asking for the size of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = in.nextInt();
        
        // Initializing the 2D array with the given size
        int[][] arr = new int[rows][cols];

        // Taking input for the 2D array
        System.out.println("Enter the elements of the array:");
        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < cols; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // Printing the 2D array
        System.out.println("The 2D array is:");
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // Move to the next line after printing all columns in a row
        }

        // let's print the array by using enhanced for loops
        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

        for(int row = 0 ; row < arr.length ; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        in.close();
    }
}
