import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        demo("Harsh",  "Sharda", "Asyab", "Priyanka");
        demo(1, 2, 3, 4, 5);
        // demo(); // The method demo(int[]) is ambiguous for the type Overloading
    }
     // herer we are using varargs with function overloading as well 
    static void demo(int ...number) {
     System.out.println(Arrays.toString(number));
    }
    static void demo(String ...names) {
     System.out.println(Arrays.toString(names));
    }

}
