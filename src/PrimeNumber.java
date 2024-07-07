import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean ans = primecheckar(number);
        System.out.println(ans);
        in.close(); 

    }

    static boolean primecheckar(int number) {
        int c = 2;
        if (number <= 1) {
            return false;
        }
        while (c * c <= number) {
            if (number % c == 0) {
                return false;
            }
            c++ ; 
        }
        return true;

    }
}