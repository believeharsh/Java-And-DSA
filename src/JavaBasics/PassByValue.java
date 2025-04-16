package JavaBasics;

public class PassByValue {
    public static void main(String[] args) {
        int a = 10 ; 
        int b = 20 ; 

        swap(a, b ); 
        System.out.println(a + " " + b);
    }

    static void swap(int a, int b) {
        int temp = a ; 
        a = b ; 
        b = temp ; 

        
    }
    
}


// ✅ Java: Pass by Value vs Pass by Reference
// 🔹 1. Java is always Pass-by-Value
// When you pass a variable to a method, Java creates a copy of the variable and passes that copy.

// 🔹 2. What happens with Primitives?

// int a = 10;
// int b = 20;
// swap(a, b);
// a and b are primitive data types.

// When passed to swap(), Java copies their values, so any changes in swap() affect only the copies.

// Original a and b remain unchanged.

// 🔹 3. What about Objects (like arrays, lists)?

// int[] arr = {10, 20};
// swap(arr, 0, 1);  // This will work!
// Arrays/Objects are reference types.

// Java still passes the reference by value (meaning a copy of the reference).

// But this copy still points to the same object in memory.

// So, modifications to the object will reflect outside the method.

// 🔹 4. Analogy
// Think of:

// Primitives = Passing a photo 🧍‍♂️📸 → You can crumple it, but real person stays safe.

// References = Passing a map to a house 🏠🗺 → Both the original and the copy point to the same house.

