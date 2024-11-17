package OOPS.L2.StaticExamples;

public class StaticBlock {
    static int a = 4;
    static int b;

    public static void main(String[] args) {
        System.out.println("Hii, I'm Main function");
        // StaticBlock obj = new StaticBlock() ;
        System.out.println("a value " + StaticBlock.a + " " + "B value " +
                StaticBlock.b);
    }

    static {
        System.out.println("Static blocks executed");
        b = a * 2;

    }
}

// Step-by-Step Execution:
// Class Loading:

// When you run the program, the JVM starts by loading the class StaticBlock into memory.
// During this step, the JVM initializes all static variables (a and b) and executes any static blocks in the order they are written.
// Static Block Execution:

// The static block is executed immediately after the class is loaded and before any methods (like main) are called.
// In this case, the static block sets the value of b to a * 2.
// Main Method Execution:

// Once all static initialization (including static blocks) is complete, the main method is executed.
