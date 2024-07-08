import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Give the Number to check it's prime or not ? ");
        Scanner in =  new Scanner(System.in);
        int number = in.nextInt(); 
       boolean ans =  primecheck(number); 
       System.out.println(ans);

        in.close();

    }
    static boolean primecheck(int number) {
        if (number <= 1) {
            return false; 
        }
        if (number == 2) {
            return true; // 2 is a prime number
        }
        if (number % 2 == 0) {
            return false; // Even numbers other than 2 are not prime
        }
        
        int count = 3;
        while (count * count <= number) {
            if (number % count == 0) {
                return false; 
            }
            count += 2; // Increment by 2 to check only odd numbers
        }
        return true ; 
    }
}


