package ru.vcrop;

import java.util.List;

public class NQueens_51 {

    private final int[][] MASK = {
            {0x1, 0x3, 0x5, 0x9, 0x11, 0x21, 0x41, 0x81, 0x101},
            {0x2, 0x7, 0xa, 0x12, 0x22, 0x42, 0x82, 0x102, 0x2},
            {0x4, 0xe, 0x15, 0x25, 0x45, 0x85, 0x105, 0x5, 0x2},
            {0x8, 0x1c, 0x2a, 0x49, 0x88, 0x108, 0x8, 0x8, 0x8},
            {0x10, 0x38, 0x54, 0x82, 0x111, 0x10, 0x10, 0x10, 0x10},
            {0x20, 0x70, 0xa8, 0x124, 0x22, 0x21, 0x20, 0x20, 0x20},
            {0x40, 0xe0, 0x150, 0x48, 0x44, 0x42, 0x41, 0x40, 0x40},
            {0x80, 0x1c0, 0xa0, 0x90, 0x88, 0x84, 0x82, 0x81, 0x80},
            {0x100, 0x180, 0x140, 0x120, 0x110, 0x108, 0x104, 0x102, 0x101}
    };

    public List<List<String>> solveNQueens(int n) {

    }
}
