package ru.vcrop;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Number_of_Islands_200 {

    private void erase(Set<Integer> pos, int i, int delta) {
        Deque<Integer> deque = new LinkedList<>();
        deque.push(i);
        while (!deque.isEmpty()) {
            int v = deque.pop();
            if (pos.contains(v)) {
                pos.remove(v);
                if (pos.contains(v + 1)) deque.add(v + 1);
                if (pos.contains(v - 1)) deque.add(v - 1);
                if (pos.contains(v + delta)) deque.add(v + delta);
                if (pos.contains(v - delta)) deque.add(v - delta);
            }
        }
    }

    public int numIslands(char[][] grid) {
        Set<Integer> pos = new HashSet<>();
        for (int row = 0; row < grid.length; row++)
            for (int col = 0; col < grid[0].length; col++)
                if (grid[row][col] == '1') pos.add(row * (grid[0].length + 2) + col + 1);
        int count = 0;
        while (!pos.isEmpty()) {
            erase(pos, pos.iterator().next(), grid[0].length + 2);
            count++;
        }
        return count;
    }
}
