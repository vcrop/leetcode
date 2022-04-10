package ru.vcrop;

import java.util.Deque;
import java.util.LinkedList;

/*Runtime: 41 ms, faster than 74.49% of Java online submissions for Daily Temperatures.
        Memory Usage: 128.1 MB, less than 65.52% of Java online submissions for Daily Temperatures.*/
public class Daily_Temperatures_739 {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] ret = new int[temperatures.length];

        Deque<Integer> deque = new LinkedList<>();

        for (int i = ret.length - 1; i > -1; i--) {
            int count = 0;
            while (!deque.isEmpty() && temperatures[deque.getFirst()] <= temperatures[i]) {
                deque.pop();
            }
            ret[i] = deque.isEmpty() ? 0 : (deque.getFirst() - i);
            deque.push(i);
        };

        return ret;
    }
}
