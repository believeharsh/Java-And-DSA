package Practice;

import java.util.Arrays;

public class SpiralMatrixIII {
    public static void main(String[] args) {
       int[][] ans =  spiralMatrix(4, 5, 1, 2);
       System.out.println(Arrays.deepToString(ans));

    };

    public static int[][] spiralMatrix(int rows, int cols, int rStart, int cStart) {
        int n = rows * cols;
        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int[][] res = new int[n][2];
        res[0][0] = rStart;
        res[0][1] = cStart;
        int count = 1;
        int stpes = 1;
        int index = 0;

        while (count < n) {
            for (int i = 0; i < 2; i++) {
                int dr = directions[index % 4][0];
                int dc = directions[index % 4][1];
                for (int j = 0; j < stpes; j++) {
                    rStart += dr;
                    cStart += dc;

                    if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                        res[count][0] = rStart;
                        res[count][1] = cStart;
                        count++;
                    }

                }
                index++;

            }
            stpes++;
        }
        return res;
    }

}
