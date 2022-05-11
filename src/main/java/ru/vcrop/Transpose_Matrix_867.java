package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Transpose Matrix.
        Memory Usage: 43 MB, less than 85.59% of Java online submissions for Transpose Matrix.*/
public class Transpose_Matrix_867 {

    public int[][] transpose(int[][] matrix) {
        int[][] ret = new int[matrix[0].length][matrix.length];

        for (int row = 0; row < matrix.length; row++)
            for (int col = 0; col < matrix[0].length; col++)
                ret[col][row] = matrix[row][col];

        return ret;
    }
}
