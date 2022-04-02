package ru.vcrop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*Runtime: 12 ms, faster than 65.00% of Java online submissions for Merge Intervals.
        Memory Usage: 47.5 MB, less than 82.40% of Java online submissions for Merge Intervals.*/
public class Merge_Intervals_56 {

    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt((int[] i) -> i[0]).thenComparingInt(i -> i[1]));
        for (int[] i: intervals)
            if (result.isEmpty()) result.add(i);
            else if (result.get(result.size() - 1)[1] >= i[0]) {
                int[] last = result.get(result.size() - 1);
                last[1] = Math.max(i[1], last[1]);
            } else result.add(i);
        return result.toArray(int[][]::new);
    }

}
