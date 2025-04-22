package Practice;

public class StarPattern {
    public static void main(String[] args) {
        PyramidStar(4) ; 
    }
    static void PyramidStar(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height * 2 - 1; j++) {

                if (j >= height - i + 1 && j <= height + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
