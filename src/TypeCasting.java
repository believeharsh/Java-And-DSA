public class TypeCasting {
    

        public static void main(String[] args) {
            int myInt = 9;
            double myDouble = myInt; // Automatic casting: int to double
            long second = myInt;
            float third = myInt;
    
            System.out.println(myInt);    // Outputs 9
            System.out.println(myDouble); // Outputs 9.0
            System.out.println(second);
            System.out.println(third);
        }
    
        // public static void main(String[] args) {
        //     double myDouble = 9.78;
        //     int myInt = (int) myDouble; // Manual casting: double to int
    
        //     System.out.println(myDouble); // Outputs 9.78
        //     System.out.println(myInt);    // Outputs 9
        // }
        
    }
    
    // Typecasting in Java is the process of converting a variable from one data type to another. This is useful when you need to perform operations on variables that require them to be of the same type. There are two main types of typecasting in Java: widening (implicit) typecasting and narrowing (explicit) typecasting.
    
    
    
    // 1. Widening (Implicit) Typecasting
    // Widening typecasting happens automatically when converting a smaller data type to a larger data type. Since there is no loss of data, the compiler automatically performs this conversion.
    
    // Examples of Widening Typecasting:
    // byte to short, int, long, float, or double
    // short to int, long, float, or double
    // char to int, long, float, or double
    // int to long, float, or double
    // long to float or double
    // float to double
    
    
    
    // 2. Narrowing (Explicit) Typecasting
    // Narrowing typecasting requires explicit conversion because it involves converting a larger data type to a smaller data type, which can lead to data loss. This type of casting is done manually by the programmer.
    
    // Examples of Narrowing Typecasting:
    // double to float, long, int, short, or byte
    // float to long, int, short, or byte
    // long to int, short, or byte
    // int to short or byte
    // short to byte
    // char to byte or short
    
    
    
    // Key Points:
    // Widening (Automatic/Implicit) Casting: No data loss, automatic conversion by the compiler.
    // Narrowing (Manual/Explicit) Casting: Possible data loss, manual conversion required.
    // Why Use Typecasting?
    // Typecasting is used to:
    
    // Convert data types to perform operations on variables that require the same type.
    // Utilize methods that require a specific type.
    // Save memory or bandwidth by converting data to a smaller type where precision is not critical.

