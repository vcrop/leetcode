package ru.vcrop;

import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/subarray-sum-equals-k/
Runtime: 25 ms, faster than 75.02% of Java online submissions for Subarray Sum Equals K.
        Memory Usage: 59 MB, less than 27.23% of Java online submissions for Subarray Sum Equals K.*/
public class Subarray_Sum_Equals_K_560 {

    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        int sum = 0;
        for (int i: nums) {
            sum += i;
            if (sum == k) res++;
            res += map.getOrDefault(sum - k, 0);
            map.merge(sum, 1, (a, b) -> a + 1);
        }
        return res;
    }

}
