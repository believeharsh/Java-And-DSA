package fundamental.LevelOne;

public class LargestAndSmallestNumArr {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 9, 0 }; // 0 , 9
        int[] arr2 = { 0, 0, 1, 0, 0 }; // 0 , 1
        int[] arr3 = { 10, 1, 1, 1, 1, 9 }; // 1 , 10
        laregesAndSmallestNumOfARR(arr);
        laregesAndSmallestNumOfARR(arr2);
        laregesAndSmallestNumOfARR(arr3);

    }

    static void laregesAndSmallestNumOfARR(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
            if (arr[i] > largest)
                largest = arr[i];
        }

        System.out.println("Smallest Num is " + smallest + " " + "Largest Num is " + largest);

    }

}
