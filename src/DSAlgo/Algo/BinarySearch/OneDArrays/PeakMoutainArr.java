package DSAlgo.Algo.BinarySearch.OneDArrays;

// problem link :: https://www.naukri.com/code360/problems/find-peak-element_1081482?utm_source=youtube&utm_medium=affiliate&utm_campaign=codestudio_Striver_BinarySeries&count=25&page=1&search=&sort_entity=order&sort_order=ASC

// Note : when problem says that it is the mountain array then it strictly says then there will only one peak in the array but if it doesn't stated then again same code will be work; 

public class PeakMoutainArr {
    public static void main(String[] args) {
        // int[] arr = {2, 3, 4, 5, 10, 4, 3, 2, 1} ; 
        int[] arr = {2, 3, 1, 2, 3, 5 ,3 , 6, 7, 8, 9, 7} ; 
        int index = peakValue(arr) ; 
        int value = arr[index] ; 
        System.out.println("Peak Value is " + value + " at index " + index); // this should print value 10 index 4 
        
    }
    static int peakValue(int[] arr ){
        int start = 0 ; 
        int end = arr.length - 1 ; 

        if(arr[0] > arr[1]){
            return 0; 
        }
        if(arr[end] > arr[end - 1 ]){
            return end ; 
        }
        while(start <= end){
             // we have to start with this situation only because we can't somthing like ( start > end) since this won't even enter in the while loop ; 
            int mid = start + (end - start) / 2 ;
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                return mid ; 
            }
            if(arr[mid] < arr[mid+1]){
                // That means we are still on the ascending side of an array
                start = mid + 1 ; 
            }
            else{
                 // That means we are still on the descending side of an array
                end = mid ; 
            }
        }
        return -1 ; // no peak value is there in the array ;;
    }
    
}
