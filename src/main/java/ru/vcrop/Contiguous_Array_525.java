package ru.vcrop;

import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/contiguous-array/
Runtime: 49 ms, faster than 23.46% of Java online submissions for Contiguous Array.
        Memory Usage: 50.5 MB, less than 61.34% of Java online submissions for Contiguous Array.*/
public class Contiguous_Array_525 {

    public int findMaxLength(int[] nums) {
        int max = 0;
        int current = 0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, 0);

        for (int i = 0; i < nums.length; i++) {
            final int j = i;
            max = Math.max(j + 1 - map.computeIfAbsent(current += nums[i] == 0 ? -1 : 1, k -> j + 1), max);
        };

        return max;
    }
}
