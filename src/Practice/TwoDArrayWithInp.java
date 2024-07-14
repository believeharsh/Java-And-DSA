package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayWithInp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[3][3];
        
        System.out.println("Give the inputs one by one and press spacebar");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }

        }
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
        in.close();
    }
}
