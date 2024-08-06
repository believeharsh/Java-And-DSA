package DSAlgo.Algo.Sorting.CycleSort;
// Here we are applying cyclic sorting algorithm ; 

import java.util.Arrays;

public class CyclicSorting {
    public static void main(String[] args){
        int[] arr = {3, 5, 1, 2, 4}; 
        // int[] arr = {1, 2, 3, 4, 5, 6}; 
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));

    } ; 
    public static void cyclicsort(int[] arr){
        int n = arr.length ; 
        int crntInd = 0 ; 
    
        while(crntInd < n){
        
            int rightInd = arr[crntInd] - 1 ; 
            if(arr[crntInd] == arr[rightInd]){
                crntInd++ ; 
            }
            else{
                int temp = arr[crntInd] ; 
                arr[crntInd] = arr[rightInd] ;
                arr[rightInd] = temp ; 
            
            }
          
        }
    }
}
