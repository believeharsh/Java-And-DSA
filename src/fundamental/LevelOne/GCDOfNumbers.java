package fundamental.LevelOne;

public class GCDOfNumbers {
    public static void main(String[] args) {
        
        GetGCD(48, 18); 
        GetGCD(50, 10); 

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
}
