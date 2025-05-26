package DSAlgo.Recursion;

public class FibonacciNum {
    public static void main(String[] args) {
      System.out.println(FiboNum(7)) ; 
    }

    static int FiboNum(int n) {
        if(n < 2) {
            return n  ; 
        }
        return FiboNum(n - 1) + FiboNum(n - 2) ; 
    }
}
