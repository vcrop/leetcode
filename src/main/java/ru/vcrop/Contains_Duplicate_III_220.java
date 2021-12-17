package ru.vcrop;

import java.util.TreeSet;

/*https://leetcode.com/problems/contains-duplicate-iii/
        Runtime: 42 ms, faster than 40.08% of Java online submissions for Contains Duplicate III.
        Memory Usage: 42.4 MB, less than 51.31% of Java online submissions for Contains Duplicate III.*/
public class Contains_Duplicate_III_220 {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k == 0) return false;
        TreeSet<Long> queue = new TreeSet<>();
        for (int i = 0; i < nums.length; i++){
            Long ceiling = queue.ceiling((long) nums[i]);
            if (ceiling != null && ceiling - nums[i] <= t) return true;
            Long floor = queue.floor((long) nums[i]);
            if (floor != null && nums[i] - floor <= t) return true;
            if (queue.size() == k) queue.remove((long) nums[i - k]);
            queue.add((long) nums[i]);
        }
        return false;
    }

}
