package DSAlgo.Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 10, 6, 34, 90, 0, 2, 2,  12 };
        System.out.println(find(arr, 10, 0)); // true
        System.out.println(findInd(arr, 10, 0)); // 4
        System.out.println(FindLastInd(arr, 10, arr.length - 1)); // output should be 4

        // FindAllIndexs(arr, 10, 0) ; // 4

        ArrayList<Integer> result = finAllIndex(arr, 2, 0, new ArrayList<>());
        System.out.println(result); // Output: [1, 3, 5]

    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        // else if (arr[index] == target) {
        // return true;
        // } else {
        // return find(arr, target, index + 1 );
        // }

        // here we are applying the short ciruiting :
        // when the first condition is true, then stament will immeditely return true
        // becuase the || opertore return true if any one the condition is true

        // and if we use the && one then if first is false then second will never
        // execute, and if the first condition is true the second one will be executed

        return arr[index] == target || find(arr, index + 1, target);

    }

    static int findInd(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findInd(arr, target, index + 1);
        }

    }

    static int FindLastInd(int[] arr, int target, int index) {
        if (index < 0) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return FindLastInd(arr, target, index - 1);
        }

    }

    // static ArrayList<Integer> list = new ArrayList<>();

    // static void FindAllIndexs(int[] arr, int target, int index) {
    // if (index == arr.length) {
    // return;
    // }
    // if (arr[index] == target) {
    // list.add(index);
    // } else {
    // FindAllIndexs(arr, target, index + 1);
    // }
    // }

    // in the above code we are explicitly initializing the arralist and using it
    // right but if we have to use the list inside recusive call then what

    static ArrayList finAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return finAllIndex(arr, target, index + 1, list);
    }

}
