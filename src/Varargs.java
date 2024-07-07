import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(1,2,3,4);
        multiple(100, 200, 24, 25, 26, 27, 28, 29); 
    }
    
    static void fun(int ...numbers){
        // Variable length arguments allow a function to accept an arbitary number of arguments. This is particularly useful when the number of inputs to the function is not known in advance. 
        System.out.println(Arrays.toString(numbers));
    }
    static void multiple(int a , int b , int ...v){
      System.out.println(v);
   
    }
}