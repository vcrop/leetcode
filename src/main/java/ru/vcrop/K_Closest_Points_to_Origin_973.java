package ru.vcrop;

import java.util.Comparator;
import java.util.PriorityQueue;

/*https://leetcode.com/problems/k-closest-points-to-origin/
        Runtime: 23 ms, faster than 63.42% of Java online submissions for K Closest Points to Origin.
        Memory Usage: 47.2 MB, less than 92.48% of Java online submissions for K Closest Points to Origin.*/
public class K_Closest_Points_to_Origin_973 {

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(k + 1, Comparator.comparingInt((int[] i) -> -i[0] * i[0] - i[1] * i[1]));

        for (int[] p: points) {
            queue.add(p);

            if (queue.size() > k) queue.remove();
        }

        return queue.toArray(int[][]::new);

    }
}
