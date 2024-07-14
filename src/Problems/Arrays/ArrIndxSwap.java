package Problems.Arrays;

import java.util.Arrays;

public class ArrIndxSwap {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println("This is the original one" + Arrays.toString(arr));
        swap(arr, 0, 1); 
        System.out.println("After swaping " + Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2]; 
        arr[index2] = temp ; 
    }
}
