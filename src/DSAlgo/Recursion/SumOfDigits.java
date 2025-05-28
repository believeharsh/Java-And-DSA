package DSAlgo.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(CalSumOfDigits(890)); 
    }
    static int CalSumOfDigits(int n ) {
        // if(n < 1) {
        //     return 0 ; 
        // } else if(n == 1) {
        //     return 1 ; 
        // } // this will save one functin call and memory right, 

        // but if we want the better and simple code then 
        if(n == 0 ) return 0 ; 
        int digit = n % 10 ; 
        n = n / 10 ; 
        return digit + CalSumOfDigits(n) ; 
    }
}
