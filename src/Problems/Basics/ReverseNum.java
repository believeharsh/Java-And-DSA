package Problems.Basics;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println("Rerverse the Number ::");
        int n = 23456 ;  // test case 1
        // int n = 454545; // test case 2
        int ans = 0 ; 
        while (n > 0 ) {
            int rem = n % 10 ; // 6 5 4 3 2 
            n /= 10 ;  // 2345 234 23 2 
            ans = ans * 10 + rem ; // 6 65 654 6543 
        }
          System.out.println(ans);
    }
}
