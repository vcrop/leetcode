package ru.vcrop;

/*https://leetcode.com/problems/perfect-squares/
        Runtime: 48 ms, faster than 51.85% of Java online submissions for Perfect Squares.
        Memory Usage: 40.2 MB, less than 31.39% of Java online submissions for Perfect Squares.*/
public class Perfect_Squares_279 {
    public int numSquares(int n) {
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            array[i] = Integer.MAX_VALUE;
            for (int j = (int) Math.sqrt(i); j > 0; j--)
                array[i] = Math.min(array[i], array[i - j * j] + 1);
        };
        return array[n];
    }
}
