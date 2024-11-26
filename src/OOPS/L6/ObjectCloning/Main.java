package OOPS.L6.ObjectCloning;

import java.util.Arrays;


// Shallow Copying : 
// Deep copying : 

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Harsh = new Human(20, "Harsh dahiya"); 
        Human Twin = new Human(Harsh) ; // Here I'm cloning object called Harsh ; 
        System.out.println(Twin.name + " " + Twin.age);

        // try {
        //     Human twin2 = (Human) Harsh.clone() ;
        //     System.out.println(twin2.name + " " + twin2.age);
        // } catch (CloneNotSupportedException e) {
           
        //     e.printStackTrace();
        // } 

        Human twin2 = (Human) Harsh.clone() ;
        // System.out.println(twin2.name + " " + twin2.age );
        // System.out.println(Arrays.toString(twin2.arr));

        twin2.arr[0] = 100 ; 
        twin2.age = 21 ; 

         // here cloned one have the reference varible of the original object so any change that is made by cloned one will be reflect to the original one. 
        System.out.println(Arrays.toString(twin2.arr)); 
        System.out.println(Arrays.toString(Harsh.arr)); 

       
        // this is primtive so cloned varible will have it's own primitive so original class or object won't have any changes on primitives
        System.out.println(twin2.age); 
        System.out.println(Harsh.age);
    }
  

  
   
}
