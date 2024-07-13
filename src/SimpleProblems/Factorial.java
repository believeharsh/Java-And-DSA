package SimpleProblems;

public class Factorial {
    public static void main(String[] args) {
       int ans =  getfactorial(3); 
       System.out.println(ans);
    }
    static int getfactorial(int num) {
        int factorial = 1 ; 
        int i = 1 ;
      
        while ( i <= num){
      
            factorial *= i ; 
            i++ ; 
        }
      return factorial ; 
    }
}
