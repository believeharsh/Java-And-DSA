package fundamental.LevelOne;

public class LCMOfNumbers {
    public static void main(String[] args) {
        GetLCMOfNumbers(12, 15) ; 
        

    }
    // brute Forece method
    // static void GetLCMOfNumbers(int num1, int num2) {
    //     int max = Math.max(num1, num2) ; 

    //     int lcm = max ; 

    //     while(true){
    //         if(lcm % num1 == 0 && lcm % num2 == 0 ){
    //             System.out.println("LCM of given Numbers is  : " + lcm);
    //             return ; 
    //         }
    //         lcm++ ; 
    //     }
    // }


    // optimized method 

    static int gcd(int a, int b) { // this is the Euclides GCD method 
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    static void GetLCMOfNumbers(int num1, int num2) {
        int gcdVal = gcd(num1, num2);
        int lcm = (num1 * num2) / gcdVal;
        System.out.println("LCM is: " + lcm);
    }
}
