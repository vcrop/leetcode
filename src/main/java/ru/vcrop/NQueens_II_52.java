package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for N-Queens II.
        Memory Usage: 39.1 MB, less than 90.99% of Java online submissions for N-Queens II.*/
public class NQueens_II_52 {

    private final int[] MASK = {0x0, 0x380, 0x540, 0x920, 0x1110, 0x2108, 0x4104, 0x8102, 0x10101};

    private int solution(int col, int n, int[] queens) {
        if (col == n) return 1;

        int ret = 0;

        int field = 0;
        for (int j = col - 1; j > -1; j--)
            field |= MASK[col - j] >>> (8 - queens[j]);
        for (int i = 0; i < n; i++)
            if (((field >>> i) & 1) == 0) {
                queens[col] = i;
                ret += solution(col + 1, n, queens);
            }
        return ret;
    }

    public int totalNQueens(int n) {
        return solution(0, n, new int[n]);
    }
}
