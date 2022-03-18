package ru.vcrop;

import java.util.Deque;
import java.util.LinkedList;

public class Matrix_01_542 {

    public int[][] updateMatrix(int[][] mat) {
        Deque<int[]> deque = new LinkedList<>();
        for (int y = 0; y < mat.length; y++)
            for (int x = 0; x < mat[0].length; x++)
                if (mat[y][x] == 0) deque.push(new int[]{x, y});
                else mat[y][x] = Integer.MAX_VALUE;
        while (!deque.isEmpty()) {
            int[] pos = deque.pop();
            int x = pos[0];
            int y = pos[1];
            if (y != 0 && mat[y - 1][x] > mat[y][x] + 1) {
                mat[y - 1][x] = mat[y][x] + 1;
                deque.push(new int[]{x, y - 1});
            };
            if (x != 0 && mat[y][x - 1] > mat[y][x] + 1) {
                mat[y][x - 1] = mat[y][x] + 1;
                deque.push(new int[]{x - 1, y});
            };
            if (y != mat.length - 1 && mat[y + 1][x] > mat[y][x] + 1) {
                mat[y + 1][x] = mat[y][x] + 1;
                deque.push(new int[]{x, y + 1});
            };
            if (x != mat[0].length - 1 && mat[y][x + 1] > mat[y][x] + 1) {
                mat[y][x + 1] = mat[y][x] + 1;
                deque.push(new int[]{x + 1, y});
            };
        }
        return mat;
    }
}
