package ru.vcrop;

import java.util.Arrays;
import java.util.Comparator;

/*https://leetcode.com/problems/remove-covered-intervals/
Runtime: 10 ms, faster than 41.03% of Java online submissions for Remove Covered Intervals.
        Memory Usage: 47.6 MB, less than 5.77% of Java online submissions for Remove Covered Intervals.*/
public class Remove_Covered_Intervals_1288{

        public int removeCoveredIntervals(int[][] intervals) {
            Arrays.sort(intervals, Comparator.comparingInt((int[] i) -> i[0]).thenComparingInt(i -> -i[1]));
            int count = 0;
            int left = Integer.MAX_VALUE;
            int right = Integer.MIN_VALUE;
            for (int[] interval: intervals) {
                if (interval[0] <= right)
                    if (interval[1] <= right) count++;
                    else right = interval[1];
                else {
                    left = interval[0];
                    right = interval[1];
                }
            }
            return intervals.length - count;

        }

}
