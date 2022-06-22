package ru.vcrop;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Operations_to_Reduce_X_to_Zero_1658 {

    public int minOperations(int[] nums, int x) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);

        int min = Integer.MAX_VALUE;

        int sum = 0;

        for (int i: nums) sum += i;

        sum -= x;

        int sum1 = 0;

        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
            if (sum1 == x)
                min = Math.min(min, Math.min(i + 1, nums.length - i - 1));
            if (map.containsKey(sum1 - sum))
                min = Math.min(nums.length - i + map.get(sum1 - sum), min);
            map.put(sum1, i);
        }

        return min == Integer.MAX_VALUE ? -1 : min == 0 ? nums.length : min;
    }

    public static void main(String[] args) {

        System.out.println(
                new Minimum_Operations_to_Reduce_X_to_Zero_1658().minOperations(new int[]{1, 1, 4, 2, 3}, 5)
        );

        System.out.println(
                new Minimum_Operations_to_Reduce_X_to_Zero_1658().minOperations(new int[]{1, 1, 4, 2, 3}, 5)
        );
    }
}
