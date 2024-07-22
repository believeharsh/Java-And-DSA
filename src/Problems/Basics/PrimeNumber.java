package Problems.Basics;



public class PrimeNumber {

    public static void main(String[] args) {
       int number = 3 ; 
       boolean ans =  primecheck(number); 
       System.out.println(ans);

        

    }
    // Brute Force solution which comes first in mind ...................... 

    // static boolean primecheck(int number) {
    //     if (number <= 1) {
    //         return false; // 0, 1, and negative numbers are not prime
    //     }
    //     for (int div = 2; div < number; div++) {
    //         if (number % div == 0) {
    //             return false; // found a divisor, not prime
    //         }
    //     }
    //     return true; // no divisors found, prime number
    // }
  
    // second approach 
    static boolean primecheck(int number) {
        int sqrt = (int) Math.sqrt(number) ; 
        System.out.println(sqrt);
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
        while (count * count <= number) { // checking square root 
            // 2 * 2 = 4 == 2 = squareroot of 4 ; 
            if (number % count == 0) {
                return false; 
            }
            count += 2; // Increment by 2 to check only odd numbers
        }
        return true ; 
    }


    // static boolean primecheck(int number){
    //     if(number <= 1){
    //         return false ; 
    //     } 
    //     if(number % 2 == 0){
    //         return false ; 
    //     } 

    // }
}


