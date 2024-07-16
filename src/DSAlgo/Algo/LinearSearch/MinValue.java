package DSAlgo.Algo.LinearSearch;

public class MinValue {
    public static void main(String[] args) {
        int[] arr = {10, 20, 33, 45, 20, 10} ; 
        System.out.println(minValue(arr));
    }
    static int minValue(int[] arr) {
        int temp = arr[0] ; 
        for(int i = 1 ; i < arr.length  ; i ++ ){
            if(arr[i] < temp) {
               temp = arr[i] ; 
            }
        } ;
        return temp ;  
    }
}
