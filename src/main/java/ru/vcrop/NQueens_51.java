package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

public class NQueens_51 {

    private final int[][] MASK = {
            {0x1ff, 0x3, 0x5, 0x9, 0x11, 0x21, 0x41, 0x81, 0x101},
            {0x1ff, 0x7, 0xa, 0x12, 0x22, 0x42, 0x82, 0x102, 0x2},
            {0x1ff, 0xe, 0x15, 0x24, 0x44, 0x84, 0x104, 0x4, 0x4},
            {0x1ff, 0x1c, 0x2a, 0x49, 0x88, 0x108, 0x8, 0x8, 0x8},
            {0x1ff, 0x38, 0x54, 0x82, 0x111, 0x10, 0x10, 0x10, 0x10},
            {0x1ff, 0x70, 0xa8, 0x124, 0x22, 0x21, 0x20, 0x20, 0x20},
            {0x1ff, 0xe0, 0x150, 0x48, 0x44, 0x42, 0x41, 0x40, 0x40},
            {0x1ff, 0x1c0, 0xa0, 0x90, 0x88, 0x84, 0x82, 0x81, 0x80},
            {0x1ff, 0x180, 0x140, 0x120, 0x110, 0x108, 0x104, 0x102, 0x101}
    };

    private void solution(int col, int n, int[] queens, List<List<String>> ret) {
        if (col == n) {
            addQueenPosition(queens, ret);
            return;
        }
        int field = 0;
        for (int j = col - 1; j > -1; j--)
            field |= MASK[queens[j]][col - j];
        for (int i = 0; i < n; i++)
            if (((field >>> i) & 1) == 0) {
                queens[col] = i;
                solution(col + 1, n, queens, ret);
            }
    }

    private void addQueenPosition(int[] queens, List<List<String>> ret) {
        List<String> part = new ArrayList<>();
        for (int queen : queens)
            part.add(
                    new StringBuilder(".".repeat(queens.length - 1)).insert(queen, "Q").toString()
            );
        ret.add(part);
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ret = new ArrayList<>();
        solution(0, n, new int[n], ret);
        return ret;
    }


}
