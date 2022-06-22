package ru.vcrop;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array_215 {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i: nums) {
            queue.add(i);
            if (queue.size() > k) queue.poll();
        }

        return queue.poll();
    }

}
