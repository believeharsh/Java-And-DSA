package fundamental.LevelOne;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 0, 7, 3, 12, 90} ; 
        SortArr(arr) ; 
    }
    // this is bubble sort algo 
    static void SortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
