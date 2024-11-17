package OOPS.L2.StaticExamples;

public class Human {
    int age ; 
    String name ; 
    int salary ; 
    boolean married ; 
    static long population ; 

    // Instance variable : these variable are unique to each objects. 
    // Static Variable : these variable are shared among all the objects. 

    // Constructor
    public Human (int age, int salary, boolean married, String name){
        this.age = age ; 
        this.salary = salary ;
        this.married = married ; 
        this.name = name ; 
        Human.population += 1  ; 
    }
}
