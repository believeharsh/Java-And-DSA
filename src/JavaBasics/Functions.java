import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {
        int ans = sum(10, 20); // this will not print the sum here's why ??? 
        System.out.println(ans);
        int[] nums = {20, 34, 56 ,70, 10} ; 
        Change(nums);
        System.out.println(Arrays.toString(nums));
        // 
    }
    static int sum(int a , int b ){
       int result = a + b ; 
       return result ;
    }

    static void Change(int[] arr){
    arr[0] = 99 ; 
  
        // System.out.println(nums);
    }
}
