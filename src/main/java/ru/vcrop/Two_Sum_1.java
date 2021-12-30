package ru.vcrop;

import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/two-sum/
        Runtime: 2 ms, faster than 70.35% of Java online submissions for Two Sum.
        Memory Usage: 42.4 MB, less than 10.04% of Java online submissions for Two Sum.*/
public class Two_Sum_1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> elems = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            if (elems.containsKey(target - nums[i])) return new int[]{elems.get(target - nums[i]), i};
            else elems.put(nums[i], i);
        return new int[]{};
    }

}
