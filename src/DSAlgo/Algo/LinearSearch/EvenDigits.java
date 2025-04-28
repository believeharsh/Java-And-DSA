package DSAlgo.Algo.LinearSearch;
// Find how many numbers have an even number of digits in the given array.

public class EvenDigits {

    public static void main(String[] args) {
        int[] arr = {10, 30, 400, 3400, 234, 90}; 
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (hasEvenNumDigits(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean hasEvenNumDigits(int num) {
        int digits = 0;
        while (num != 0) {
            digits++;
            num /= 10;
        }
        return digits % 2 == 0;
    }
    
}
