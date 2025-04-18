package fundamental.LevelOne;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int num = 36;
        if (Check(num)) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }
    }

    static boolean Check(int num) {
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}