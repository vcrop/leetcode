package ru.vcrop;

import java.util.Arrays;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Game of Life.
        Memory Usage: 42.1 MB, less than 69.86% of Java online submissions for Game of Life.*/
public class Game_of_Life_289 {

    private int value(int row, int col, int[][] board) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length)
            return 0;
        return board[row][col] & 1;
    }

    public void gameOfLife(int[][] board) {
        for (int row = 0; row < board.length; row++)
            for (int col = 0; col < board[0].length; col++) {
                int ones = 0;
                ones += value(row - 1, col - 1, board);
                ones += value(row - 1, col, board);
                ones += value(row - 1, col + 1, board);
                ones += value(row, col - 1, board);
                ones += value(row, col + 1, board);
                ones += value(row + 1, col - 1, board);
                ones += value(row + 1, col, board);
                ones += value(row + 1, col + 1, board);

                if (ones ==3) board[row][col] += 2;
                if (ones == 2 && board[row][col] == 1) board[row][col] += 2;
            }

        for (int row = 0; row < board.length; row++)
            for (int col = 0; col < board[0].length; col++)
                board[row][col] >>>= 1;
    }
}
