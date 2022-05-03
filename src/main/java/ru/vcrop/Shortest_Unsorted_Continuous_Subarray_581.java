package ru.vcrop;

import java.util.ArrayDeque;
import java.util.Deque;

/*Runtime: 9 ms, faster than 34.10% of Java online submissions for Shortest Unsorted Continuous Subarray.
        Memory Usage: 42.9 MB, less than 86.58% of Java online submissions for Shortest Unsorted Continuous Subarray.*/
public class Shortest_Unsorted_Continuous_Subarray_581 {
    public int findUnsortedSubarray(int[] nums) {
        if (nums.length < 2) return 0;

        Deque<Integer> deque = new ArrayDeque<>();

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[deque.peekFirst()] > nums[i]) low = Math.min(low, deque.pop());
            deque.push(i);
        }

        deque = new ArrayDeque<>();

        for (int i = nums.length - 1; i > -1; i--) {
            while (!deque.isEmpty() && nums[deque.peekFirst()] < nums[i]) high = Math.max(high, deque.pop());
            deque.push(i);
        }

        return low == Integer.MAX_VALUE || high == Integer.MIN_VALUE ? 0 : high - low + 1;
    }

}
