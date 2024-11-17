package OOPS.L2.SingletonClasses;

public class SingletonClass {
    private SingletonClass() {

    }

    private static SingletonClass instence ; 

    public static SingletonClass getInstence() {
        if( instence == null) {
            instence = new SingletonClass(); // it will create one obj of Singletonclass and after that, same obj reference will be returned. 

        }
        return instence ; 
    }
    
}

// here I used singleton classes to understand that how we allow the constructor to be called only once. so when the user will create new object, he will get the reference of one object again and again. 



// You're absolutely correct! Singleton class is not a feature provided by Java itself but a design pattern used to ensure that only one instance of a class is created throughout the lifecycle of an application. This pattern is commonly used to manage shared resources or configurations in an application.

// What Is a Singleton Class in Java?
// A singleton class is a class that:

// Allows only one instance of itself to be created.
// Provides a global point of access to that instance.
// This is achieved by:

// Making the constructor private, so no other class can instantiate it directly.
// Providing a static method to create and access the instance.
