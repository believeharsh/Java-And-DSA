package DSAlgo.DS.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
      ArrayList<Integer> list = new ArrayList<>(10);
    //   list.add(340); 
    //   list.add(340); 
    //   list.add(340); 
    //   list.add(340); 
    //   list.add(340); 
    //   list.add(340); 
    //   list.add(340); 
    //   list.add(340); 


        // System.out.println(list);
        // list.contains(340);
        // list.set(0, 34); 
        System.out.println("Enter the elements for the list");

        for(int i = 0 ; i < 10 ; i++){
            list.add(in.nextInt()); 
        }
        System.out.println(list);

        // for (int i = 0; i < 7; i++) {
        //     System.out.println(list.get(i));
        // }
        in.close();
    }
 
}
