package ru.vcrop;

/*Runtime: 2 ms, faster than 88.13% of Java online submissions for The K Weakest Rows in a Matrix.
        Memory Usage: 48.5 MB, less than 67.48% of Java online submissions for The K Weakest Rows in a Matrix.*/
public class The_K_Weakest_Rows_in_a_Matrix_1337 {

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        int pointer = 0;
        for (int col = 0; col < mat[0].length + 1; col++)
            for (int row = 0; row < mat.length; row++) {
                if (col == 0) {
                    if (mat[row][col] == 0) result[pointer++] = row;
                } else if (col == mat[0].length && mat[row][col - 1] == 1) result[pointer++] = row;
                else if (col < mat[0].length && mat[row][col - 1] == 1 && mat[row][col] == 0) result[pointer++] = row;
                if (pointer == k) return result;
            }
        return result;
    }
}
