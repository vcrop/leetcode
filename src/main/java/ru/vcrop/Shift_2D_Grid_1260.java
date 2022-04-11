package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

/*Runtime: 7 ms, faster than 76.36% of Java online submissions for Shift 2D Grid.
        Memory Usage: 55.2 MB, less than 18.99% of Java online submissions for Shift 2D Grid.*/
public class Shift_2D_Grid_1260 {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int size = grid.length * grid[0].length;

        k %= size;

        List<List<Integer>> ret = new ArrayList<>();
        for (int row = 0; row < grid.length; row++) {
            List<Integer> row_list = new ArrayList<>();
            ret.add(row_list);
            for (int col = 0; col < grid[0].length; col++) {
                int pos = (size + row * grid[0].length + col - k) % size;
                row_list.add(grid[pos / grid[0].length][pos % grid[0].length]);
            }
        }

        return ret;
    }
}
