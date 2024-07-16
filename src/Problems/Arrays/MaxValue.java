package Problems.Arrays ; 
public class MaxValue {
    // Find the MaxValue of an Array :::: 

    public static void main(String[] args) {
        int[] arr = {9 , 20 , 45, 29, 90, 570};
        System.out.println(max(arr));
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
}