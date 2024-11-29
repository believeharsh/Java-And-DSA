package OOPS.L7.Collections;

import java.util.*;

public class Collection {

    // what is the Collection FrameWork in java?
    // the Vector class is a part of the Collection Framework, located in the
    // java.util package. It provides a dynamic array that can grow or shrink as
    // needed, similar to the ArrayList class. However, Vector is synchronized,
    // making it thread-safe but generally slower than ArrayList.
    public static void main(String[] args) {

        // List<Integer> list = new ArrayList<>() ;
        // List<Integer> list2 = new LinkedList<>();

        // list.add(2) ;
        // list.add(4) ;
        // list.add(8) ;
        // for( int i = 0 ; i < list.size() ; i++){
        // System.out.println(list.get(i));
        // }

        // list2.add(12) ;
        // list2.add(14) ;
        // list2.add(18) ;

        // System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(124);
        vector.add(124);
        vector.add(124);
        System.out.println(vector);

    }
}