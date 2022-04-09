package ru.vcrop;

import java.util.Comparator;
import java.util.PriorityQueue;

/*Runtime: 11 ms, faster than 97.56% of Java online submissions for Kth Largest Element in a Stream.
        Memory Usage: 46.6 MB, less than 84.35% of Java online submissions for Kth Largest Element in a Stream.*/
public class Kth_Largest_Element_in_a_Stream_703 {

    private final int k;
    private final PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    public Kth_Largest_Element_in_a_Stream_703(int k, int[] nums) {
        this.k = k;
        for (int i: nums) add(i);
    }

    public int add(int val) {
        priorityQueue.add(val);
        if (priorityQueue.size() > k) priorityQueue.remove();
        return priorityQueue.element();
    }

}
