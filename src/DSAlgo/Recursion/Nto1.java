package DSAlgo.Recursion;

public class Nto1 {
    public static void main(String[] args) {
        int n = 10;
        // funRev(n);
        // funBoth(n) ; 
    }

    // static void fun(int n) {
    // if (n == 0) {
    // return;
    // }
    // System.out.println(n);
    // fun(n - 1);
    // }

    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);
        System.out.println(n);
    }

    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("forward rec : -> " + n) ; 
        funRev(n - 1);
        System.out.println("downward rec : -> " + n);
    }

}
