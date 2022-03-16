package ru.vcrop;

public class Number_of_Enclaves_1020 {

    private int solution(int[][] grid, int[][] visited, int y, int x, int[] b) {
        if (grid[y][x] == 0 || visited[y][x] != 0) return 0;
        if (x == 0 || y == 0 || x == grid[0].length - 1 || y == grid.length - 1) b[0] = 0;
        visited[y][x] = 1;
        int result = 1;
        if (x != 0) result += solution(grid, visited, y, x - 1, b);
        if (x < grid[0].length - 1) result += solution(grid, visited, y, x + 1, b);
        if (y != 0) result += solution(grid, visited, y - 1, x, b);
        if (y < grid.length - 1) result += solution(grid, visited, y + 1, x, b);
        return result * b[0];
    }

    public int numEnclaves(int[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];
        int result = 0;
        for (int y = 0; y < grid.length; y++)
            for (int x = 0; x < grid[0].length; x++)
                result += solution(grid, visited, y, x, new int[]{1});
        return result;
    }
}
