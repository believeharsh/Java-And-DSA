package DSAlgo.Algo.Sorting.CycleSort;
// Problem Link : https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicateNum {
    public static void main(String[] args) {

        int[][] inputs = {
            {1, 2, 3, 3, 4, 5}, // number is 3 
            {1, 5, 2, 3, 5, 4}, // Number is 5 
            {1,3,4,2,2},  // Number is 2 
            {1 , 1, 2, 4, 3, 6, 5}, // Number is 1 ,
            {1, 2, 4, 3, 6 , 6, 5} // number is 6 ; 
        };

        for(int i = 0 ; i < inputs.length ; i++){
            System.out.println("The Duplicate Number of " + (i + 1) + " array is " + FindDuplicate(inputs[i]) );
        }

    };

    public static int FindDuplicate(int[] arr) {
        int n = arr.length;
        int crntInd = 0;
        while (crntInd < n) {
           if(arr[crntInd] != crntInd + 1){
            int rightInd = arr[crntInd] - 1 ; 
            if(arr[crntInd] != arr[rightInd]){
                swap(arr, crntInd, rightInd) ; 
            }
            else{
                return arr[crntInd] ; 
            }
           }
           else{
            crntInd++ ; 
           }
        }
        return -1;
    };

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second] ; 
        arr[second] = temp;
    }

}
