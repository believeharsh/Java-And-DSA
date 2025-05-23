package JavaBasics;

public class PerformanceStrings {
    public static void main(String[] args) {
        // String series = "" ; // this will work but everytime it will create a new
        // object since the strings are immutable so this is not the good solution as
        // well.
        StringBuilder series = new StringBuilder();

        for (int i = 0; i <= 26; i++) {
            char ch = (char) ('a' + i);
            series.append(ch);
        }
        System.out.println(series.toString());
    }
}
