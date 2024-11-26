package OOPS.L6.ObjectCloning;

// import java.util.Arrays;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr ; 


    public Human(int age, String name) {
        this.age = age ; 
        this.name = name ; 
        this.arr = new int[]{1,2,3,4,5};
    }
    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    

    // shallow Copy here ; 

    // @Override
    // public Object clone() throws CloneNotSupportedException {
    //     // This is the shallow copy 
    //     return super.clone();
    // }


    // Deep copy here ; 
    @Override
    public Object clone() throws CloneNotSupportedException {
        // This is the deep copy 

       Human Twin = (Human) super.clone() ; 
       Twin.arr = new int[Twin.arr.length] ; 
    for(int i = 0 ; i < Twin.arr.length ; i++) {
        Twin.arr[i] = this.arr[i] ; 
    }

       return Twin ; 
       
    }
}
