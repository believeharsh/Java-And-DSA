package DSAlgo.Recursion;

public class CountZeroRec {
    public static void main(String[] args) {
        System.out.println(count(1030040));
    }

    static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);

    }

    static int count(int n) {
        return helper(n, 0);
    }

}
