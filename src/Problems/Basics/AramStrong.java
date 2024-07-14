package Problems.Basics;

public class AramStrong {
    public static void main(String[] args) {
        boolean ans = AramStrongNum(153);
        // boolean ans = AramStrongNum( 370);
        // boolean ans = AramStrongNum(371);
        System.out.println(ans);
        // these are sum three digit armstong numbers 153 , 370, 371, 407
        checkArmstrongNumbers(153, 370, 371, 407, 123, 999);

    }

    static boolean AramStrongNum(int num) {
        int realnum = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            int cube = rem * rem * rem;
            num = num / 10;
            sum += cube;

        }
        return realnum == sum;
    }

    // by using function overloading we can impliment this function like this as
    // well

    static void checkArmstrongNumbers(int... numbers) {
        for (int num : numbers) {
            if (AramStrongNum(num)) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }
        }
    }

}
