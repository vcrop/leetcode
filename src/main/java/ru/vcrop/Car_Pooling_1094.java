package ru.vcrop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*https://leetcode.com/problems/car-pooling/
Runtime: 11 ms, faster than 14.36% of Java online submissions for Car Pooling.
        Memory Usage: 41.5 MB, less than 16.67% of Java online submissions for Car Pooling.*/
public class Car_Pooling_1094 {

    public boolean carPooling(int[][] trips, int capacity) {
        Queue<int[]> deque = new PriorityQueue<>(Comparator.comparingInt(i -> i[2]));
        Arrays.sort(trips, Comparator.comparingInt(t -> t[1]));
        for (int[] i: trips) {
            while (!deque.isEmpty() && deque.peek()[2] <= i[1])
                capacity += deque.poll()[0];
            capacity -= i[0];
            if (capacity < 0) return false;
            deque.add(i);
        }
        return true;

    }

}
