package ru.vcrop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;


//unsolved
public class Pacific_Atlantic_Water_Flow_417 {

/*    private int walk(int[][] heights, int[][] visit, int[][] success, int x, int y, IntPredicate ocean_x, IntPredicate ocean_y) {
        if (visit[y][x] == 1) return success[y][x];
        visit[y][x] = 1;
        if (ocean_x.test(x) || ocean_y.test(y)) return success[y][x] = 1;
        if (x != 0 && heights[y][x - 1] <= heights[y][x] && walk(heights, visit, success, x - 1, y, ocean_x, ocean_y) == 1) return success[y][x] = 1;
        if (x < heights[0].length - 1 && heights[y][x + 1] <= heights[y][x] && walk(heights, visit, success, x + 1, y, ocean_x, ocean_y) == 1) return success[y][x] = 1;
        if (y != 0 && heights[y - 1][x] <= heights[y][x] && walk(heights, visit, success, x, y - 1, ocean_x, ocean_y) == 1) return success[y][x] = 1;
        if (y < heights.length - 1 && heights[y + 1][x] <= heights[y][x] && walk(heights, visit, success, x, y + 1, ocean_x, ocean_y) == 1) return success[y][x] = 1;
        return success[y][x] = 0;
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int[][] visit = new int[heights.length][heights[0].length];
        int[][] pacific = new int[heights.length][heights[0].length];
        for (int y = 0; y < heights.length; y++)
            for (int x = 0; x < heights[0].length; x++)
                walk(heights, visit, pacific, x, y, a -> a == 0, b -> b == 0);
        visit = new int[heights.length][heights[0].length];
        int[][] atlantic = new int[heights.length][heights[0].length];
        for (int y = 0; y < heights.length; y++)
            for (int x = 0; x < heights[0].length; x++)
                walk(heights, visit, pacific, x, y, a -> a == heights[0].length - 1, b -> b == heights.length - 1);
        List<List<Integer>> result = new ArrayList<>();
        for (int y = heights.length; y > -1; y--)
            for (int x = heights[0].length - 1; x > -1; x--)
                if (pacific[y][x] == 1 && atlantic[y][x] == 1)
                result.add(List.of(x, y));
        return result;
    }*/
}
