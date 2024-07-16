package Problems.Arrays ; 
public class MaxValue {
    // Find the MaxValue of an Array :::: 

    public static void main(String[] args) {
        int[] arr = {9 , 20 , 45, 29, 90, 570};
        System.out.print("This is the max value of array = ");
        System.out.println(max(arr));

        int[] arr2 = {23, 4, 5, 10, 110, 80}; 
        System.out.print("Here is the Maxvalue between Range = ");
        System.out.println(maxValRange(arr2, 2, 5));

        System.out.println();
    }
    static int max(int[] arr) {
        int tempMax = arr[0]; 
        for(int i = 1 ; i < arr.length ; i++) {
            if(tempMax < arr[i]){
                tempMax = arr[i];
            }

        }
        return tempMax ; 
    }
    static int maxValRange(int[] arr, int start, int end) {
        if (arr == null || start < 0 || end >= arr.length || start > end) {
            throw new IllegalArgumentException("Invalid input parameters");
        }
    
        int tempMax = arr[start]; 
        for (int i = start + 1; i <= end; i++) {
            if (tempMax < arr[i]) {
                tempMax = arr[i];
            }
        }
        return tempMax; 
    }
}