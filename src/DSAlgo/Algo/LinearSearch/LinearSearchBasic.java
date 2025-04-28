package DSAlgo.Algo.LinearSearch;

// Question:
// "Given an array of integers and a target value, perform the following operations:
// (1) Search for the target and return its index if found, else return -1.
// (2) Search for the target and return the element itself if found, else return Integer.MAX_VALUE.
// (3) Search for the target and return true if it is present, otherwise return false."

public class LinearSearchBasic {
    public static void main(String[] args) {
        int[] arr = { 10, 29, 48, 56, 12, 42 };
        System.out.println("Target is availabel at the " + linearsearch(arr, 42) + " index");
        System.out.println("Target element is " + linearsearch2(arr, 48));
        System.out.println(linearsearch3(arr, 12));
    }
    // search the taget in the array then return the index if available; 
    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // search the target and return the element ; 
    static int linearsearch2(int[] arr , int target) {
        if(arr.length == 0 ) return -1 ; 
        for (int elem : arr) {
            if(elem == target) return elem ; 
        }
        return Integer.MAX_VALUE ; 
    }
    // search the target and return true if found otherwise false ; 
    static boolean linearsearch3(int[] arr , int target) {
        if(arr.length == 0 ) return false ; 
        for (int elem : arr) {
            if(elem == target) return true ; 
        }
        return false; 
    }
}
