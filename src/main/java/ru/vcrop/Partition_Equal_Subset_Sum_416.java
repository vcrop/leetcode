package ru.vcrop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Partition_Equal_Subset_Sum_416 {
    private boolean recursion(int index, int[] nums, int sum, Map<Integer, Set<Integer>> map) {
        if (index == nums.length) return sum == 0;

        if (!map.computeIfAbsent(index, k -> new HashSet<>()).contains(sum)) {
            map.get(index).add(sum - nums[index]);
            map.get(index).add(sum);
            if (recursion(index + 1, nums, sum - nums[index], map)) return true;
            if (recursion(index + 1, nums, sum, map)) return true;
        }
        return false;
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i: nums) sum += i;
        if (sum % 2 != 0) return false;
        return recursion(0, nums, sum / 2, new HashMap<>());
    }
}
