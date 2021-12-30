package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

/*https://leetcode.com/problems/pascals-triangle/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle.
        Memory Usage: 38.6 MB, less than 10.00% of Java online submissions for Pascal's Triangle.*/
public class Pascals_Triangle_118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(1));
        for (int i = 2; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++)
                row.add(j == 0 || j == i - 1 ? 1 : triangle.get(i - 2).get(j - 1) + triangle.get(i - 2).get(j));
            triangle.add(row);
        }
        return triangle;

    }
}
