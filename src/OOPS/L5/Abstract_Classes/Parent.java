package OOPS.L5.Abstract_Classes;

public abstract class Parent {
    int age ; 
    static int count ; 
    Parent(int age) {
        this.age = age ;         
    }
    static {
        count = 10;
        System.out.println("Static block in abstract class executed");
    }

    static void name() {
        System.out.println("HII, I'm Harsh Dahiya");
    }

    abstract void Carrer() ;
    abstract void Partner();
    
}
