package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix II.
        Memory Usage: 42.1 MB, less than 42.79% of Java online submissions for Spiral Matrix II.*/
public class Spiral_Matrix_II_59 {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;
        int x = 0;
        int y = 0;
        int offset = 0;
        while (count <= n * n) {
            while (x < n- offset) matrix[y][x++] = count++;
            x--;
            y++;
            while (y < n - offset) matrix[y++][x] = count++;
            y--;
            x--;
            while (x >= offset) matrix[y][x--] = count++;
            x++;
            y--;
            offset++;
            while (y >= offset) matrix[y--][x] = count++;
            y++;
            x++;
        }
        return matrix;
    }
}
