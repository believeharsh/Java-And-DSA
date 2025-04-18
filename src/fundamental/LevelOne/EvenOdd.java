package fundamental.LevelOne;

// 🔢 Even Number:
// An even number is any integer that is exactly divisible by 2.

// That means:
// 👉 number % 2 == 0
// (The remainder after dividing by 2 is 0)

// Examples:
// ... -4, -2, 0, 2, 4, 6, 8, 10, ...

// 🔢 Odd Number:
// An odd number is any integer that is not divisible by 2.

// That means:
// 👉 number % 2 != 0
// (The remainder after dividing by 2 is 1 or -1)

// Examples:
// ... -3, -1, 1, 3, 5, 7, 9, 11, ...

// 🧠 Quick Tip:
// Even numbers end in 0, 2, 4, 6, or 8

// Odd numbers end in 1, 3, 5, 7, or 9

public class EvenOdd {
    public static void main(String[] args) {
        int num = 10;
        checkEvenOdd(num);
    }

    static void checkEvenOdd(int num) {

        if (num % 2 == 0) {
            System.out.println("this number is Even");
        } else {
            System.out.println("Number is odd");
        }

    }
}
