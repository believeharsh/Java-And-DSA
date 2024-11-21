package OOPS.L5.Abstract_Classes;

public class Son extends Parent {

    Son(int age) {
      super(age); 
    }

    @Override
     void Carrer(){
        // super()
        System.out.println("I want to be an Engineer");

     }
     @Override
     void Partner() {
        System.out.println("I want to marry a girl named Vaishali");
     }
    
}
