package ru.vcrop;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Jump_Game_VI_1696 {

    public int maxResult(int[] nums, int k) {
        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> priority = new PriorityQueue<>(Comparator.reverseOrder());

        queue.add(nums[0]);
        priority.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int val = nums[i] + priority.peek();
            if (queue.size() == k) {
                int rem = queue.poll();
                priority.remove(rem);
            }
            queue.add(val);
            priority.add(val);
        }

        int res = 0;

        while (!queue.isEmpty()) res = queue.poll();

        return res;
    }

    public static void main(String[] args) {
        System.out.println(
                new Jump_Game_VI_1696().maxResult(new int[]{1,-5,-20,4,-1,3,-6,-3}, 2)
        );
    }
}
