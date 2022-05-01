package ru.vcrop;

import java.util.*;

public class LC3Sum_15 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int target = - nums[i];
            Set<Integer> visited = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++)
                if (visited.contains(target - nums[j])) result.add(List.of(-target, target - nums[j], nums[j]));
                else visited.add(nums[j]);
        }
        return new ArrayList<>(result);
    }

}
