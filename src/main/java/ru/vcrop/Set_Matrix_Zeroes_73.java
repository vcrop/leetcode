package ru.vcrop;

import java.util.Arrays;

/*Runtime: 1 ms, faster than 93.01% of Java online submissions for Set Matrix Zeroes.
        Memory Usage: 44 MB, less than 82.80% of Java online submissions for Set Matrix Zeroes.*/
public class Set_Matrix_Zeroes_73 {

    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean firstCol = false;

        for (int row = 0; row < matrix.length; row++)
            for (int col = 0; col < matrix[0].length; col++)
                if (matrix[row][col] == 0) {
                    if (row == 0) firstRow = true;
                    if (col == 0) firstCol = true;
                    if (row != 0) matrix[row][0] = 0;
                    if (col != 0) matrix[0][col] = 0;
                }

        for (int row = 1; row < matrix.length; row++)
            for (int col = 1; col < matrix[0].length; col++) {
                if (matrix[row][0] == 0) matrix[row][col] = 0;
                if (matrix[0][col] == 0) matrix[row][col] = 0;
            };

        if (firstRow) Arrays.fill(matrix[0], 0);

        if (firstCol)
            for (int row = 0; row < matrix.length; row++) matrix[row][0] = 0;

    }
}
