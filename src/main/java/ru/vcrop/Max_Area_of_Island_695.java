package ru.vcrop;

/*Runtime: 4 ms, faster than 54.50% of Java online submissions for Max Area of Island.
        Memory Usage: 48.1 MB, less than 18.30% of Java online submissions for Max Area of Island.*/
public class Max_Area_of_Island_695 {

    private int solution(int[][] grid, int[][] visited, int y, int x) {
        if (grid[y][x] == 0 || visited[y][x] != 0) return 0;
        visited[y][x] = 1;
        int result = 1;
        if (x != 0) result += solution(grid, visited, y, x - 1);
        if (x < grid[0].length - 1) result += solution(grid, visited, y, x + 1);
        if (y != 0) result += solution(grid, visited, y - 1, x);
        if (y < grid.length - 1) result += solution(grid, visited, y + 1, x);
        return result;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];
        int max = Integer.MIN_VALUE;
        for (int y = 0; y < grid.length; y++)
            for (int x = 0; x < grid[0].length; x++)
                max = Math.max(max, solution(grid, visited, y, x));
        return max;
    }
}
