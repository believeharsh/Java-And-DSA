package fundamental.LevelOne;

public class FactorialNumber {
    public static void main(String[] args) {
        long result = FactorialOfNumber(5) ; 
        System.out.println(result);
    }

    static long FactorialOfNumber(int number) {
      long result = 1 ; 

      while(number > 1) {
        result *= number  ;  
        number-- ; 
      }

      return result ; 
    }
}
