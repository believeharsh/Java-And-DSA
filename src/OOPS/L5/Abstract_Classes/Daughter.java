package OOPS.L5.Abstract_Classes;

public class Daughter extends Parent{
    Daughter(int age) {
        super(age);
    }
    @Override
    void Carrer(){
        System.out.println("I want to be an Architect");

     }
     @Override
     void Partner() {
        System.out.println("I want to marry a Boy Named NishiDahiya");
     }
}
