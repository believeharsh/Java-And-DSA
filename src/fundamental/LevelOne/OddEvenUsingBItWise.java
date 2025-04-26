package fundamental.LevelOne;

public class OddEvenUsingBItWise {
    public static void main(String[] args) {
       boolean one =  checkIsOdd(67) ; 
       System.out.println(one);

       boolean two = checkIsOdd(90) ; 
       System.out.println(two);
    }

    static boolean checkIsOdd(int n ) {
        return (n & 1) == 1 ; // here we are using bitwise and & that will give the LSB, so if the lsb will be 0 then the number is even or if 1 then number is even 
    }
}
