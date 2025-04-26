package fundamental.LevelOne;

public class LeapYearCheck {
    public static void main(String[] args) {
        int num  = 2020 ; 
        boolean letsCheck = check(num) ; 
        System.out.println(letsCheck);

    }

    static boolean check(int year) {
        System.out.print("This Year is the leap Year  : ");
        return ( year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 );
    }
}
