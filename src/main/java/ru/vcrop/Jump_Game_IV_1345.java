package ru.vcrop;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*https://leetcode.com/problems/jump-game-iv/
        Runtime: 63 ms, faster than 70.25% of Java online submissions for Jump Game IV.
        Memory Usage: 51.2 MB, less than 94.00% of Java online submissions for Jump Game IV.*/
public class Jump_Game_IV_1345 {

    public int minJumps(int[] arr) {
        Map<Integer, List<Integer>> map = IntStream.range(0, arr.length).boxed()
                .collect(Collectors.groupingBy(n -> arr[n]));
        Deque<Integer> deque = new LinkedList<>();
        int count = 0;
        deque.add(0);
        while (!deque.isEmpty()) {
            Deque<Integer> tmp = new LinkedList<>();
            while (!deque.isEmpty()) {
                int val = deque.pop();
                if (val == arr.length - 1) return count;
                if (map.containsKey(arr[val]))
                    for (int i: map.remove(arr[val]))
                        if (i != val) tmp.add(i);
                if (val != 0 && map.containsKey(arr[val - 1])) tmp.add(val - 1);
                if (map.containsKey(arr[val + 1])) tmp.add(val + 1);
            };
            deque = tmp;
            count++;
        }
        return -1;
    }
}
