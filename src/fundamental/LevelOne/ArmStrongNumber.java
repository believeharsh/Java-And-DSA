package fundamental.LevelOne;

public class ArmStrongNumber {
    // Time Complexity: O(log n) because we loop based on the number of digits (d = log₁₀(n))
    // Space Complexity: O(1) since we removed the String usage

    public static void main(String[] args) {
        CheckArmStrongNum(153);  // Test case
    }

    static void CheckArmStrongNum(int num) {
        int count = 0;
        int temp = num;

        // Count digits
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        int originalNum = num;
        int sum = 0;

        // Calculate sum of digits raised to the power of digit count
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            sum += Math.pow(digit, count);
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong Number");
        }
    }
}
