package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPeekElem {
    public static void main(String[] args) {
        // Define test cases
        ArrayList<ArrayList<Integer>> testCases = new ArrayList<>();
        testCases.add(new ArrayList<>(Arrays.asList(1, 3, 20, 4, 1, 0))); // should print index 2 
        testCases.add(new ArrayList<>(Arrays.asList(10, 20, 15, 2, 23, 90, 67)));  // should print index 5 
        testCases.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9))); // should print index 8 
        testCases.add(new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1))); // should print index 0
        testCases.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 2, 1))); // should print index 3 
        testCases.add(new ArrayList<>(Arrays.asList(2, 3, 1, 2, 3, 5 ,3 , 6, 7, 8, 9, 7))); // should print index 1 , 5, 10 ( any one )
        System.out.println();
        System.out.println();

        // Iterate over each test case and find the peak element
        for (ArrayList<Integer> testCase : testCases) {
            int peakIndex = findPeak(testCase);
            System.out.println("For array: " + testCase + " Peak element index: " + peakIndex);
        }
    }

    public static int findPeak(ArrayList<Integer> arr) {
        if (arr.get(0) > arr.get(1)) return 0;
        if (arr.get(arr.size() - 1) > arr.get(arr.size() - 2)) return arr.size() - 1;

        int start = 1;
        int end = arr.size() - 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(mid - 1) && arr.get(mid) > arr.get(mid + 1)) {
                return mid;
            }
            if (arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return -1;
    }
}