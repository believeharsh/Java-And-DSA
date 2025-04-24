package fundamental.LevelOne;

public class GCDOfNumbers {
    public static void main(String[] args) {
        
        GetGCD(48, 18); 
        gcd(48, 18 ) ; 
        gcdRec(48, 18) ; 
        // GetGCD(50, 10); 

    }
    // this is the brute force apporoach 
    static void GetGCD(int num1 , int num2){
        num1 = Math.abs(num1) ; 
        num2 = Math.abs(num2) ; 

        int min = Math.min(num1, num2) ; 

        for(int i = min ; i >= 1 ; i--){
            if(num1 % i == 0 && num2 % i == 0){
                System.out.println("GCD of the Given Numbers is  : " + i);
                return ; 
            }
        }
        System.out.println("GCD of the Given Numbers is  : " + 1);
    }

    static int gcd(int a, int b) { // this is the Euclides GCD method 
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD of the given numbers is : " + a);
        return a ; 
    }

    // static int gcdRec(int a, int b) {
    //     if (b == 0) {
    //         System.out.println("GCD of the given numbers is : " + a);
    //         return a;
    //     }
    //     return gcd(b, a % b);
    // }

    // doesn't matter you can choose any number to be a GCd right ; 
    static int gcdRec(int a, int b) {
        if (a == 0) {
            System.out.println("GCD of the given numbers is : " + a);
            return b;
        }
        return gcd(a, b % a);
    }

}
    
