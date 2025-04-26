package fundamental.LevelOne;

public class findIthBit {
    public static void main(String[] args) {
        System.out.println(getIthBit(13, 3)) ; 
    }

    static int getIthBit(int n, int i) {
        return (n >> i) & 1;
        // OR
        // return (n & (1 << i)) != 0 ? 1 : 0;
    }
}
