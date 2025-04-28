package DSAlgo.Algo.LinearSearch;

// Question:
// "Given an array, a target value, and a range (start and end index), search for the target only within the specified range and return its index. If the target is not found, return -1."

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 15, 16, 17} ; 
        int target = 345 ; 
        System.out.println(searchInRange(arr, target, 1, 4));
    }

    static int searchInRange(int[] arr , int target , int start , int end) {
        if(arr.length == 0) return -1 ; 
        for(int index = start ; index <= end ; index++) {
            int elem = arr[index] ; 
            if(elem == target) return index ; 
        }
        return -1 ; 
    }
}
