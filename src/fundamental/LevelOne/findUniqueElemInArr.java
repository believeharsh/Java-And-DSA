package fundamental.LevelOne;

public class findUniqueElemInArr {
    public static void main(String[] args) {
        int[] arr1 = { 2, 2, 4, 4, 5, 5, 3 };
        int res1 = findUnique(arr1);
        System.out.println(res1);
    }

    static int findUnique(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            // here we are doing the Xor bitwise operation, if the bit are same then Xor gives zero otherwise 1 ; 
            // at the end the unique value will be saved in the unique variable 
            unique ^= n;
        }
        return unique;
    }
}
