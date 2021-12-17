package ru.vcrop;

/*https://leetcode.com/problems/maximal-square/
        Runtime: 4 ms, faster than 89.99% of Java online submissions for Maximal Square.
        Memory Usage: 42.3 MB, less than 52.42% of Java online submissions for Maximal Square.*/
public class Maximal_Square_221 {

    public int maximalSquare(char[][] matrix) {
        int max = 0;
        int[][] fields = new int[matrix.length][matrix[0].length];
        for (int y = 0; y < matrix.length; y++)
            for (int x = 0; x < matrix[y].length; x++) {
                if (matrix[y][x] == '1') {
                    fields[y][x] = Math.min(x == 0 || y == 0 ? 0 : fields[y - 1][x - 1],
                            Math.min(x == 0 ? 0 : fields[y][x - 1], y == 0 ? 0 : fields[y - 1][x])) + 1;
                    max = Math.max(fields[y][x], max);
                }
            }
        return max * max;
    }

}
