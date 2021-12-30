package ru.vcrop;

/*https://leetcode.com/problems/reshape-the-matrix/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Reshape the Matrix.
        Memory Usage: 39.9 MB, less than 62.75% of Java online submissions for Reshape the Matrix.*/
public class Reshape_the_Matrix_566 {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) return mat;
        int[][] res = new int[r][c];
        for (int i = 0; i < r * c; i++)
            res[i / c][i % c] = mat[i / mat[0].length][i % mat[0].length];
        return res;
    }
}
