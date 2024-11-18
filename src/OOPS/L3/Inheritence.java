// What is the Inheritence ?
// In Object-Oriented Programming (OOP), inheritance is a mechanism where one class acquires the properties (fields) and behaviors (methods) of another class. The class that inherits is called the child class (or subclass), and the class being inherited from is the parent class (or superclass). This helps in code reuse and establishing a relationship between classes.

package OOPS.L3;

public class Inheritence {

    static class Animal {

        String name;

        void eat() {
            System.out.println(name + " is eating");
        }
    }

    static class Dog extends Animal {
        void Bark() {
            System.out.println(name + " is barking");

        }
    }

    public static void main(String[] args) {
        // Properties properties = new Properties();
        // Dog mydog = properties.new Dog(); // here we've created the instance of the
        // outer class called properties

        // here we can directly create the instance of child class if both classes are
        // static
        Dog mydog = new Dog();
        mydog.name = "Dizo";
        mydog.eat();
        mydog.Bark();
    }
}