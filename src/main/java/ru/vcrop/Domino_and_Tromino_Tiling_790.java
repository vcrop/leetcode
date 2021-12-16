package ru.vcrop;

/*https://leetcode.com/problems/domino-and-tromino-tiling/
        Runtime: 41 ms, faster than 5.83% of Java online submissions for Domino and Tromino Tiling.
        Memory Usage: 90.4 MB, less than 5.68% of Java online submissions for Domino and Tromino Tiling.*/
public class Domino_and_Tromino_Tiling_790 {

    public int numTilings(int n) {
        if (n == 1) return 1;
        long[][] res = new long[n + 2][n + 2];
        res[1][1] = 1L;
        res[2][2] = 2L;
        res[1][2] = 1L;
        res[2][1] = 1L;
        res[2][3] = 2L;
        res[3][2] = 2L;
        for (int i = 3; i <= n; i++) {
            res[i][i] = (res[i - 2][i - 2] + res[i - 1][i - 1] + res[i - 1][i - 2] + res[i - 2][i - 1]) % 1_000_000_007;
            res[i + 1][i] = (res[i - 1][i] + res[i - 1][i - 1]) % 1_000_000_007;
            res[i][i + 1] = (res[i][i - 1] + res[i - 1][i - 1]) % 1_000_000_007;
        } ;
        return (int) res[n][n];
    }

}
