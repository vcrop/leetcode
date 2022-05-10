package ru.vcrop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*Runtime: 1 ms, faster than 73.61% of Java online submissions for Combination Sum III.
        Memory Usage: 42.2 MB, less than 11.99% of Java online submissions for Combination Sum III.*/
public class Combination_Sum_III_216 {

    public List<List<Integer>> solution(int low, int k, int n) {
        List<List<Integer>> ret = new ArrayList<>();
        if (k == 1) {
            if (low < n && n < 10) {
                ret.add(new LinkedList<>() {{
                    add(n);
                }});
                return ret;
            } else return null;
        } else
            for (int i = low + 1; i <= 10; i++) {
                List<List<Integer>> down = solution(i, k - 1, n - i);
                if (down != null)
                    for (List<Integer> l : down) {
                        l.add(0, i);
                        ret.add(l);
                    }
            }
        return ret;

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        return solution(0, k, n);
    }
}
