package fundamental.LevelOne;

public class SumOfNumbersDigits {
    public static void main(String[] args) {
        sum(1234);

    }

    static void sum(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Sum of the digits of the " + originalNumber + " is " + sum);
    }
}
