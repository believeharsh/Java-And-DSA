package JavaBasics;

public class TypeCating {
    public static void main(String[] args) {
    // ✅ What is Type Casting in Java?
    // Type Casting in Java means converting a variable from one data type to another.

    // 🔄 Two Types of Type Casting:
    // 1. Widening (Implicit) Casting
    // Automatically done by Java — from smaller to larger types.

    // int x = 10;
    // double y = x; // int to double (no loss of data)
    // ✅ Safe — no data loss
    // ✅ No explicit syntax needed

    // 2. Narrowing (Explicit) Casting
    // Done manually by the programmer — from larger to smaller types.


    // double a = 9.78;
    // int b = (int) a; // Explicit casting (possible data loss)
    // ⚠️ May lose data (decimal part lost here)
    // ⚠️ Syntax: (targetType) value

    // 📌 Why Should You Know Type Casting as a Developer?
    // 🚀 Real-World Uses:
    // Working with APIs / Libraries
    // Sometimes data comes in general types (like Object) and needs to be cast to specific ones.

    // Performance Optimization
    // Choosing smaller types (like byte, short) when memory is critical.

    // Custom Class Casting (Polymorphism)
    // Example: Upcasting & downcasting between parent and child classes.

 
    // Animal a = new Dog(); // Upcasting (safe)
    // Dog d = (Dog) a;      // Downcasting (needs caution)
    // Dealing with Collections
    // Generics and object manipulation sometimes require casting.

    // Preventing Bugs
    // Knowing where precision might be lost helps write accurate, predictable code.

    // 💡 Extra Tips:
    
    // Always check compatibility before casting.

    // Prefer widening conversions when possible.

    // Use instanceof before downcasting objects to avoid ClassCastException.
    }
}
