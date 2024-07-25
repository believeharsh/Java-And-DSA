package DSAlgo.Algo.BinarySearch;

public class PeakMoutainArr {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 10, 4, 3, 2, 1} ; 
        System.out.println(peakValue(arr));
        
    }
    static int peakValue(int[] arr ){
        int start = 0 ; 
        int end = arr.length - 1 ; 
        while(start < end){ // we have to start with this situation only because we can't somthing like ( start > end) since this won't even enter in the while loop ; 
            int mid = start + (end - start) / 2 ;
            if(arr[mid] < arr[mid+1]){
                // That means we are still on the ascending side of an array
                start = mid + 1 ; 
            }
            else{
                end = mid ; 
            }
        }
        return start ; // because at the end start and end will be the same and this will only return when start and end will be the same ; 
    }
    
}
