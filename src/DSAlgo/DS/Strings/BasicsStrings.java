package DSAlgo.DS.Strings;

public class BasicsStrings {
    /*
     * 1. What is a String in Java?
     * Definition: In Java, a String is a sequence of characters. It is an object
     * that represents text. Strings in Java are instances of the java.lang.String
     * class.
     * Syntax: Strings can be created using double quotes:
    
     * String str = "Hello, World!";
     * 
     * 
     * 2. String Immutable Feature
     * Immutability: In Java, strings are immutable, meaning once a String object is
     * created, it cannot be changed or modified. Any operation that seems to modify
     * a string (like concatenation) actually creates a new String object.
     * 
     * Reason: This immutability is important for security, synchronization, and
     * performance optimization (e.g., caching of string literals).
     * 
     * Example:
    
     * String str1 = "Hello";
     * String str2 = str1.concat(" World");
     * // str1 remains "Hello", and str2 is "Hello World"
     * 
     * 
     * 3. String Pool
     * Definition: The String Pool (also known as the interned string pool) is a
     * special memory area inside the Java heap where string literals are stored.
     * Optimization: When you create a string literal, Java checks the string pool
     * first. If the string already exists in the pool, a reference to the existing
     * string is returned. If not, the new string is added to the pool.
    
     * String str1 = "Hello";
     * String str2 = "Hello";
     * // Both str1 and str2 point to the same object in the string pool
     * 
     * 
     
     * 4. Different References to the Same Object
     * Definition: If two string variables reference the same string literal, they
     * point to the same object in memory (because of the string pool).
     * Example:
     
     * String str1 = "Hello";
     * String str2 = "Hello";
     * // str1 and str2 refer to the same memory location in the string pool
     * 
     
     
     * 5. new Keyword for Creating Objects in the Heap (Whether It's Duplicates or
     * Not)
     * Using new: When you create a String using the new keyword, a new object is
     * always created in the heap memory, even if an identical string exists in the
     * string pool.
     * Example:

     * String str1 = new String("Hello");
     * String str2 = new String("Hello");
     * // str1 and str2 are different objects in the heap, even though they contain
     * the same text
     *
     
     * 6. == vs. .equals() in Strings and How They Differentiate
     * == Operator:
     * 
     * Purpose: Compares references, not the actual content of the strings.
     * Behavior: Returns true if both references point to the same object.
     * Example:

     * String str1 = "Hello";
     * String str2 = "Hello";
     * System.out.println(str1 == str2); // true (same reference in string pool)
     * 
     * String str3 = new String("Hello");
     * System.out.println(str1 == str3); // false (different objects in memory)
     * .equals() Method:
     * 
     * Purpose: Compares the content of the strings.
     * Behavior: Returns true if the sequences of characters in both strings are
     * identical.
     * Example:
     
     * String str1 = "Hello";
     * String str2 = new String("Hello");
     * System.out.println(str1.equals(str2)); // true (same content)
     * 
     * 
     * 7. What is StringBuilder?
     * Definition: StringBuilder is a mutable sequence of characters. Unlike String,
     * StringBuilder objects can be modified after they are created. It's part of
     * java.lang.StringBuilder.
     * 
     * Usage: StringBuilder is used when you need to perform many modifications to a
     * string, such as appending, inserting, or reversing characters. It is more
     * efficient than using String for such operations because it doesn't create new
     * objects for every modification.
     * 
     * Example:
     * 
    
     StringBuilder sb = new StringBuilder("Hello");
     sb.append(" World");

     * System.out.println(sb.toString()); // Output: "Hello World"
     * Performance: StringBuilder is faster than String when doing multiple string
     * manipulations in a loop, as it does not create new objects each time.
     * 
     * By understanding these concepts, you can make more informed decisions when
     * working with strings in Java, optimizing both memory usage and performance.
     */
    public static void main(String[] args) {
        
    }
}