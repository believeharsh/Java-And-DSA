package Pattern.SpiralMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrixIII {
    public static void main(String[] args){
        int[][] result = spiralMatrixIII(2, 3, 0, 0);
        System.out.println(Arrays.toString(result)) ; 
    }
      public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int numSteps = 1;
        int totalCells = rows * cols;
        List<int[]> result = new ArrayList<>();
        int r = rStart, c = cStart;
        int d = 0;

        while (result.size() < totalCells) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < numSteps; j++) {
                    if (0 <= r && r < rows && 0 <= c && c < cols) {
                        result.add(new int[]{r, c});
                    }
                    if (result.size() == totalCells) {
                        return convertListToArray(result);
                    }
                    r += directions[d][0];
                    c += directions[d][1];
                }
                d = (d + 1) % 4;
            }
            numSteps++;
        }

        return convertListToArray(result);
    }

    public static int[][] convertListToArray(List<int[]> list) {
        int[][] array = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
