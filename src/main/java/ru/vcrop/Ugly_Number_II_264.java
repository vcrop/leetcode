package ru.vcrop;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/*Runtime: 146 ms, faster than 8.19% of Java online submissions for Ugly Number II.
        Memory Usage: 60.8 MB, less than 13.61% of Java online submissions for Ugly Number II.*/
public class Ugly_Number_II_264 {

    public int nthUglyNumber(int n) {

        Set<Integer> values = new HashSet<>();
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);

        int val = 0;

        while (values.size() != n) {
            val = queue.remove();
            if (val > 0 && values.add(val)) {
                if (Integer.MAX_VALUE / 2 >= val) queue.add(val * 2);
                if (Integer.MAX_VALUE / 3 >= val) queue.add(val * 3);
                if (Integer.MAX_VALUE / 5 >= val) queue.add(val * 5);
            }
        }

        return val;
    }
}
