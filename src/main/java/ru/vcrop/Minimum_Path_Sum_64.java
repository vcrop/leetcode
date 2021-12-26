package ru.vcrop;

/*https://leetcode.com/problems/minimum-path-sum/
        Runtime: 2 ms, faster than 81.02% of Java online submissions for Minimum Path Sum.
        Memory Usage: 41.6 MB, less than 80.50% of Java online submissions for Minimum Path Sum.*/
public class Minimum_Path_Sum_64 {

    public int minPathSum(int[][] grid) {
        for (int y = 0; y < grid.length; y++)
            for (int x = 0; x < grid[0].length; x++)
                grid[y][x] += y == 0 ? x == 0 ? 0 : grid[y][x - 1] :
                        x == 0 ? grid[y - 1][x] : Math.min(grid[y - 1][x], grid[y][x - 1]);
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
