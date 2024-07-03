import java.util.Scanner;

public class FiboNum {
    public static void main(String[] args) {
        System.out.println("Fibonacci Numbers Coding ::");
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the first Fibonacci number:");
        int first = in.nextInt();
        
        System.out.println("Enter the second Fibonacci number:");
        int second = in.nextInt();
        
        System.out.println("Enter the position (n) to calculate the Fibonacci value:");
        int n = in.nextInt();
        
        if (n <= 0) {
            System.out.println("Position should be a positive integer.");
        } else if (n == 1) {
            System.out.println("The 1st Fibonacci number is: " + first);
        } else if (n == 2) {
            System.out.println("The 2nd Fibonacci number is: " + second);
        } else {
            int count = 3; 
            int nthFibonacci = 0;
            
            while (count <= n) {
                nthFibonacci = first + second; 
                first = second; 
                second = nthFibonacci; 
                count++;
            }
            
            System.out.println(n + "th Fibonacci number is: " + nthFibonacci);

            // Note : this code will give negative value for large interger's for the nth number like  45  and 50. so if we want to calculate larger fibonacci numbers we have to use bigInteger class provided by java. 
        }

        in.close();
    }
}