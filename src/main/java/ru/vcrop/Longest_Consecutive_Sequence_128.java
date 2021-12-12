package ru.vcrop;

import java.util.HashSet;
import java.util.Set;


/*https://leetcode.com/problems/longest-consecutive-sequence/
Runtime: 11 ms, faster than 92.01% of Java online submissions for Longest Consecutive Sequence.
  Memory Usage: 54.1 MB, less than 64.83% of Java online submissions for Longest Consecutive Sequence.*/
public class Longest_Consecutive_Sequence_128 {

    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        int max = 0;
        for (int i: nums) numbers.add(i);

        while (!numbers.isEmpty()) {
            int value = numbers.iterator().next();
            numbers.remove(value);
            int down = value;
            int sum = 1;
            while (numbers.remove(--down)) sum++;
            while (numbers.remove(++value)) sum++;
            max = Math.max(max, sum);
        }

        return max;
    }

}
