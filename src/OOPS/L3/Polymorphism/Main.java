package OOPS.L3.Polymorphism ; 
public class Main {
    public static void main(String[] args) {
        // Parent class reference pointing to a Dog object
        Animal animal1 = new Dog();
        animal1.sound(); // Output: Dogs bark

        // Parent class reference pointing to a Cat object
        Animal animal2 = new Cat();
        animal2.sound(); // Output: Cats meow

        // Parent class reference pointing to an Animal object
        Animal animal3 = new Animal();
        animal3.sound(); // Output: Animals make sounds
    }
}