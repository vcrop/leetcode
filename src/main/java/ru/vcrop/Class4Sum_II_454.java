package ru.vcrop;

import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/4sum-ii/
Runtime: 97 ms, faster than 98.93% of Java online submissions for 4Sum II.
        Memory Usage: 42.2 MB, less than 58.26% of Java online submissions for 4Sum II.*/
public class Class4Sum_II_454 {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for (int i: nums1)
            for (int j: nums2)
                map.merge(i + j, 1, (a, b) -> a + 1);
        for (int i: nums3)
            for (int j: nums4)
                count += map.getOrDefault(-i - j, 0);
        return count;
    }
}
