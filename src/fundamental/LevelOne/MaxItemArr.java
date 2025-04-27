package fundamental.LevelOne;

public class MaxItemArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 99, 0 };
         System.out.println(getMaxInRange(arr, 2, 4)) ; 
         System.out.println(getMax(arr));
    }

    static int getMax(int[] arr) {
        int maxItem = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (maxItem < arr[i]) {
                maxItem = arr[i];
            }
        }
        return maxItem ; 
    }
    static int getMaxInRange(int[] arr, int start, int end) {
        int maxItem = arr[start];

        for (int i = start; i <= end; i++) {
            if (maxItem < arr[i]) {
                maxItem = arr[i];
            }
        }
        return maxItem ; 
    }
}
