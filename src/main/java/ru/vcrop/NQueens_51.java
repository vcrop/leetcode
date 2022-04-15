package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

/*Runtime: 2 ms, faster than 97.62% of Java online submissions for N-Queens.
        Memory Usage: 42.8 MB, less than 85.74% of Java online submissions for N-Queens.*/
public class NQueens_51 {

    private final int[] MASK = {0x0, 0x380, 0x540, 0x920, 0x1110, 0x2108, 0x4104, 0x8102, 0x10101};

    private void solution(int col, int n, int[] queens, List<List<String>> ret) {
        if (col == n) {
            addQueenPosition(queens, ret);
            return;
        }
        int field = 0;
        for (int j = col - 1; j > -1; j--)
            field |= MASK[col - j] >>> (8 - queens[j]);
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
