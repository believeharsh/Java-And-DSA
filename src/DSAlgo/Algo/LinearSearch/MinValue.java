package DSAlgo.Algo.LinearSearch;

// Question:
// "Given an array of integers, find and return the minimum element in the array."

public class MinValue {
    public static void main(String[] args) {
        int[] arr = {10, 20, 33, 45, 20, 10} ; 
        System.out.println(minValue(arr));
    }
    static int minValue(int[] arr) {
        int min = arr[0] ; 
        for(int i = 1 ; i < arr.length ; i++ ){
            if(arr[i] < min) {
               min = arr[i] ; 
            }
        } 
        return min ;  
    }
}
