package DSAlgo.Recursion;

public class RecursionExample {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {

        System.out.println(n);
        if (n < 5) {
            print(n + 1);
        } else {
            return;
        }
    }
}