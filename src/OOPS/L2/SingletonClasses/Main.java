package OOPS.L2.SingletonClasses;

public class Main {
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstence();
        System.out.println(obj1.toString());
        SingletonClass obj2 = SingletonClass.getInstence();
        System.out.println(obj2.toString());
        SingletonClass obj3 = SingletonClass.getInstence();
        System.out.println(obj3.toString());
    }
    
}
