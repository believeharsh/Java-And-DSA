package fundamental.LevelOne;

public class SetTheIthBit {
    public static void main(String[] args) {
        setIthBit(13, 1) ; 
    }
    static int setIthBit(int n, int i) {
        return n | (1 << i);
    }
}
