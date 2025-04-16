package JavaBasics;

// When a child class redefines a method from the parent class with the same signature.
// 🔥 Java decides which method to call at runtime based on the object type (Run-Time Polymorphism).

public class functionOverRiding {
    public static void main(String[] args) {

        class Animal {
            void sound() {
                System.out.println("Animal sound");
            }
        }
        
        class Dog extends Animal {
            @Override
            void sound() {
                System.out.println("Barks");
            }
        }
        

    }
}
