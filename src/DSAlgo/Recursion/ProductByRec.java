package DSAlgo.Recursion;

public class ProductByRec {

    public static void main(String[] args) {
        int ans = product(1234);
        System.out.println(ans);
    }

    static int product(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * product(n / 10);
    }

    static void concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        concept(--n);
    }
}