package ru.vcrop;

import java.util.*;
import java.util.stream.Collectors;

/*Runtime: 27 ms, faster than 20.54% of Java online submissions for Sudoku Solver.
        Memory Usage: 42.3 MB, less than 20.21% of Java online submissions for Sudoku Solver.*/
public class Sudoku_Solver_37 {

    private boolean backtracking(char[][] board, int row, int col,
                                 Map<Integer,Set<Character>> hor,
                                 Map<Integer,Set<Character>> ver,
                                 Map<Integer,Set<Character>> sqr) {
        if (row == 9) return true;

        if (board[row][col] == '.') {
            for (char i = '1'; i <= '9'; i++)
                if (!hor.get(row).contains(i) &&
                        !ver.get(col).contains(i) &&
                        !sqr.get(row / 3 * 3 + col / 3).contains(i)
                ) {
                    board[row][col] = i;

                    hor.get(row).add(i);
                    ver.get(col).add(i);
                    sqr.get(row / 3 * 3 + col / 3).add(i);

                    if (backtracking(board, row + (col == 8 ? 1 : 0), (col + 1) % 9, hor, ver, sqr)) return true;

                    board[row][col] = '.';

                    hor.get(row).remove(i);
                    ver.get(col).remove(i);
                    sqr.get(row / 3 * 3 + col / 3).remove(i);

                }
        } else return backtracking(board, row + (col == 8 ? 1 : 0), (col + 1) % 9, hor, ver, sqr);

        return false;
    }
    public void solveSudoku(char[][] board) {
        Map<Integer,Set<Character>> hor = new HashMap<>();
        Map<Integer,Set<Character>> ver = new HashMap<>();
        Map<Integer,Set<Character>> sqr = new HashMap<>();


        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char cell = board[row][col];
                if (cell != '.') {
                    hor.computeIfAbsent(row, k -> new HashSet<>()).add(cell);
                    ver.computeIfAbsent(col, k -> new HashSet<>()).add(cell);
                    sqr.computeIfAbsent(row / 3 * 3 + col / 3, k -> new HashSet<>()).add(cell);
                }
            }
        }

        backtracking(board, 0, 0, hor, ver, sqr);

    }

}
