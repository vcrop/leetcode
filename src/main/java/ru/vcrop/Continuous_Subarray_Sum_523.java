package ru.vcrop;

import java.util.HashSet;
import java.util.Set;

/*https://leetcode.com/problems/continuous-subarray-sum/
Runtime: 24 ms, faster than 58.56% of Java online submissions for Continuous Subarray Sum.
        Memory Usage: 95 MB, less than 52.11% of Java online submissions for Continuous Subarray Sum.*/
public class Continuous_Subarray_Sum_523 {

    public boolean checkSubarraySum(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        int last = 0;
        boolean repeat = false;
        s.add(last);
        for (int i: nums)
            if (i % k == 0)
                if (repeat) return true;
                else repeat = true;
            else {
                if (!s.add(last = (last + i) % k)) return true;
                else repeat = false;
            }
        return false;
    }
}
