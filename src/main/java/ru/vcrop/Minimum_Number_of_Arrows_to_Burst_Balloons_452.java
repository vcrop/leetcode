package ru.vcrop;

import java.util.Arrays;
import java.util.Comparator;

/*https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
        Runtime: 56 ms, faster than 51.05% of Java online submissions for Minimum Number of Arrows to Burst Balloons.
        Memory Usage: 62.7 MB, less than 97.18% of Java online submissions for Minimum Number of Arrows to Burst Balloons.*/
public class Minimum_Number_of_Arrows_to_Burst_Balloons_452 {

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(p -> p[0]));
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int[] p: points)
            if (p[0] > min) {
                res++;
                min = p[1];
            } else {
                min = Math.min(min, p[1]);
            };
        return res + 1;
    }
}
