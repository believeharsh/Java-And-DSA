package Problems.Basics;

public class CountSum {
    // If you've given a number let's say 1234523 and how you to write a program which returns how many time one number is present ( for example num 2 present for 2 times and same goes for 3 as well);

    public static void main(String[] args) {
        System.out.println("CountSum Question Solve");
        int number = 34567; 
        int count = 0; 
        
        while(number > 0 ){
         int rem = number % 10 ;
         if(rem == 2 ){
            count++; 
         } 
         number = number / 10 ; 

        }
        System.out.println(count);
    }
    
}
