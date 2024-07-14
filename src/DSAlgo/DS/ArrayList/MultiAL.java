package DSAlgo.DS.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialize
        System.out.println("Adding few empty Arralist in the ArrayList");
        for(int i = 0 ; i < 3 ; i++) {
            list.add(new ArrayList<>());
        }
        // taking input for each sub Arraylist and  adding the elements in each Arraylist here ; 
        System.out.println("taking input for each sub Arraylist and  adding the elements in each Arraylist here");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
        in.close();
    }
}

/*
 * Here is the Explanation of how this code is working actually ?
 * How the Input Works in the Nested Loop
* Initialization:

* The outer loop (i) runs 3 times, initializing 3 empty ArrayLists in list.
* Input Collection:

* The nested loop prompts for input one integer at a time.
* For each i (0, 1, 2), the inner loop (j) runs 3 times.
* Each in.nextInt() call waits for the user to enter an integer and hit Enter or Space.
* The entered integer is immediately added to the current ArrayList (list.get(i)).
Example:
* For i = 0:

* j = 0: User enters 1 (added to list.get(0)).
* j = 1: User enters 2 (added to list.get(0)).
* j  = 2: User enters 3 (added to list.get(0)).
For i = 1:

* j = 0: User enters 4 (added to list.get(1)).
* j = 1: User enters 5 (added to list.get(1)).
* j = 2: User enters 6 (added to list.get(1)).
For i = 2:

* j = 0: User enters 7 (added to list.get(2)).
* j = 1: User enters 8 (added to list.get(2)).
* j = 2: User enters 9 (added to list.get(2)).
 */
