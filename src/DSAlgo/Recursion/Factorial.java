package DSAlgo.Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(SumOfNto1(5));
    }

    static int fact (int n ) {
    if(n <= 1) {
        return 1 ; 
    }
    return n * fact(n - 1) ; 

    }


    static int SumOfNto1(int n ) {
        if( n <= 1 ) {
            return 1 ; 
        }
        return n + SumOfNto1(n - 1) ; 
    }
}
