package JavaBasics;

// ✅ What is it?
// Sometimes, we want to pass a variable number of arguments to a method (instead of a fixed number). Java allows this using ... (three dots).

// ✅ Rule:
// You can have only one varargs in a method.

// It must be the last parameter.

public class VariableArguments {

    public static void main(String[] args) {
        show(1);
        show(1, 2);
        show(1, 2, 3, 4, 5);

    }

    static void show(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

}
