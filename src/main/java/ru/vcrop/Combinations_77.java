package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

/*
Runtime: 42 ms, faster than 34.68% of Java online submissions for Combinations.
        Memory Usage: 74.2 MB, less than 6.06% of Java online submissions for Combinations.*/
public class Combinations_77 {

    private List<List<Integer>> solution(int from, int to, int k) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = from; i <= to; i++) {
            if (k != 0)
                for (List<Integer> l: solution(i + 1, to, k - 1)) {
                    l.add(0, i);
                    result.add(l);
                } else result.add(new ArrayList<>(List.of(i)));
        }
        return result;
    }

    public List<List<Integer>> combine(int n, int k) {
        return solution(1, n, k - 1);
    }
}
