package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Image.
        Memory Usage: 42.8 MB, less than 49.11% of Java online submissions for Rotate Image.*/
public class Rotate_Image_48 {

    private void rotate(int[][] matrix, int offset) {
        for (int i = 0; i < matrix.length - offset * 2 - 1; i++) {
            int tmp = matrix[offset + i][matrix.length - 1 - offset];
            matrix[offset + i][matrix.length - 1 - offset] = matrix[offset][offset + i];
            int tmp1 = matrix[matrix.length - 1 - offset][matrix.length - 1 - offset - i];
            matrix[matrix.length - 1 - offset][matrix.length - 1 - offset - i] = tmp;
            tmp = tmp1;
            tmp1 = matrix[matrix.length - 1 - offset - i][offset];
            matrix[matrix.length - 1 - offset - i][offset] = tmp;
            matrix[offset][offset + i] = tmp1;
        }
    }

    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++)
            rotate(matrix, i);
    }
}
