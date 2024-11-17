package OOPS.L2;

public class InnerClasses {
    public static void main(String[] args) {
        System.out.println("main func");
        Test a = new Test("Harsh Dahiya");
        Test b = new Test("Vaibhav Dahiya");

        System.out.println(a.name + " " + b.name);
    }

    // the static modifier has no impact on the behavior of instance variables or
    // methods in the nested class. Each instance of the nested class operates
    // independently.
    
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }
}
