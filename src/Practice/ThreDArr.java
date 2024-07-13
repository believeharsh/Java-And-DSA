package Practice;

public class ThreDArr {
    public static void main(String[] args) {
        System.out.println("Let's print the Three D Array");
        int[][][] arr = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            },
            {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
            },
            {
                {19, 20, 21},
                {22, 23, 24},
                {25, 26, 27}
            }
        };

        // Print the 3D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println(); // Newline for the next 2D array
            }
            System.out.println();
        }; // Newline for the next 2D array within the 3D array
    }
}
