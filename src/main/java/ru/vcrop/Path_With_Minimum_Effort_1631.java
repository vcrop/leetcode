package ru.vcrop;

import java.util.Arrays;

public class Path_With_Minimum_Effort_1631 {

    private void sol(int[][] heights, int[][] weights, int row, int col) {
        if (row != 0) {
           int diff = Math.abs(heights[row][col] - heights[row - 1][col]);
           if (weights[row - 1][col] > weights[row][col] + diff) {
               weights[row - 1][col] = weights[row][col] + diff;
               sol(heights, weights, row - 1, col);
           }
        }
        if (col != 0) {
            int diff = Math.abs(heights[row][col] - heights[row][col - 1]);
            if (weights[row][col - 1] > weights[row][col] + diff) {
                weights[row][col - 1] = weights[row][col] + diff;
                sol(heights, weights, row, col - 1);
            }
        }
        if (row != heights.length - 1) {
            int diff = Math.abs(heights[row][col] - heights[row + 1][col]);
            if (weights[row + 1][col] > weights[row][col] + diff) {
                weights[row + 1][col] = weights[row][col] + diff;
                sol(heights, weights, row + 1, col);
            }
        }
        if (col != heights[0].length - 1) {
            int diff = Math.abs(heights[row][col] - heights[row][col + 1]);
            if (weights[row][col + 1] > weights[row][col] + diff) {
                weights[row][col + 1] = weights[row][col] + diff;
                sol(heights, weights, row, col + 1);
            }
        }
    }

    public int minimumEffortPath(int[][] heights) {
        int[][] weights = new int[heights.length][heights[0].length];
        for (int[] row: weights)
            Arrays.setAll(row, n -> Integer.MAX_VALUE);
        weights[0][0] = 0;
        sol(heights, weights, 0, 0);
        return weights[weights.length - 1][weights[0].length - 1];
    }
}
