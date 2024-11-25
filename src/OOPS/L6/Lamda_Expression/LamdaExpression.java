package OOPS.L6.Lamda_Expression;

// import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

// import Problems.Basics.Calculator;

public class LamdaExpression {

    // What is the Lamda Expression in java?
    // A lambda expression is a short way to write code that implements a single
    // abstract method of a functional interface. It simplifies coding, especially
    // when working with functional interfaces and collections.

    @FunctionalInterface
    interface Calculator {
        int add(int a, int b);
    }

    int Caculator(int a, int b) {
        return (a + b);
    }

    private int operate(int a, int b, Calculator calc) {
        return calc.add(a, b);
    }

    public static void main(String[] args) {
        // Using a lambda expression to define the add method
        Calculator calc = (a, b) -> a + b;
        System.out.println("Sum: " + calc.add(5, 3));

        Calculator sum = (a, b) -> (a + b);
        Calculator multiply = (a, b) -> (a * b);
        Calculator Minus = (a, b) -> (a - b);

        LamdaExpression MyCalcutor = new LamdaExpression();
        System.out.println(MyCalcutor.operate(1, 2, sum));
        System.out.println(MyCalcutor.operate(1, 2, multiply));
        System.out.println(MyCalcutor.operate(1, 2, Minus));

        // without Lamda
        List<String> names = List.of("Alice", "Bob", "Charlie");
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });

        // With Lamda Expression
        names.forEach(name -> System.out.println(name));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.stream()
                .filter(n -> n % 2 == 0) // Lambda for filtering even numbers
                .forEach(System.out::println); // Method reference (shorthand for lambdas)


        // Why Not Write Code Directly Without Lambdas?
        // Less Readable: Writing verbose anonymous classes clutters code, especially when implementing simple behaviors.
        // Harder to Maintain: Lambdas make code easier to follow since they reduce the overhead of unnecessary syntax.
        // Boilerplate Reduction: Lambdas remove repetitive code patterns, making programs more concise. 


        // Lambda expressions are not about doing something new; they are about doing the same thing more cleanly, concisely, and in a functional programming style. They're especially helpful for callbacks, functional interfaces, and simplifying the usage of the Stream API.
    }

}
