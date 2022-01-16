package ru.vcrop;

import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/longest-well-performing-interval/
        Runtime: 11 ms, faster than 44.86% of Java online submissions for Longest Well-Performing Interval.
        Memory Usage: 39.5 MB, less than 75.14% of Java online submissions for Longest Well-Performing Interval.*/
public class Longest_Well_Performing_Interval_1124 {

    public int longestWPI(int[] hours) {
        int max = 0;
        int sum = 0;
        Map<Integer,Integer> s = new HashMap<>();
        s.put(0, -1);
        for (int i = 0; i < hours.length; i++) {
            int j = i;
            if (hours[i] > 8) sum++;
            else sum--;
            if (sum < 0) s.computeIfAbsent(sum, k -> j);
            max = Math.max(max, i - s.getOrDefault(Math.min(sum - 1, 0), i));
        };
        return max;
    }
}
