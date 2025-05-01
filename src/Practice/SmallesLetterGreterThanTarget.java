package Practice;

public class SmallesLetterGreterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';

        char result = nextGreatestLetter(letters, target);
        System.out.println("The next greatest letter after '" + target + "' is: " + result);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        return binarySearch(letters, target);
    }

    private static char binarySearch(char[] letters, char target) {
        int low = 0, high = letters.length - 1;
        char ans = letters[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (letters[mid] > target) {
                ans = letters[mid]; // possible answer
                high = mid - 1;     // check for smaller in left side
            } else {
                low = mid + 1;      // move right
            }
        }

        return ans;
    }
}
