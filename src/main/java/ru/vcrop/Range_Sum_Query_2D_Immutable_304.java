package ru.vcrop;

import java.util.Arrays;

/*Runtime: 149 ms, faster than 79.60% of Java online submissions for Range Sum Query 2D - Immutable.
        Memory Usage: 133.8 MB, less than 16.91% of Java online submissions for Range Sum Query 2D - Immutable.*/
public class Range_Sum_Query_2D_Immutable_304 {

    int[][] sums;

    public Range_Sum_Query_2D_Immutable_304(int[][] matrix) {
        sums = new int[matrix.length + 1][matrix[0].length + 1];
        Arrays.setAll(sums[0], n -> 0);

        for (int row = 1; row < sums.length; row++) {
            sums[row][0] = 0;
            for (int col = 1; col < sums[0].length; col++)
                sums[row][col] = matrix[row - 1][col - 1] + sums[row - 1][col] + sums[row][col - 1] - sums[row - 1][col - 1];
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sums[row2 + 1][col2 + 1] - (sums[row2 + 1][col1] + sums[row1][col2 + 1] - sums[row1][col1]);
    }
}
