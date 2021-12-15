package ru.vcrop;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

/*https://leetcode.com/problems/longest-increasing-subsequence/
        Runtime: 28 ms, faster than 68.18% of Java online submissions for Longest Increasing Subsequence.
        Memory Usage: 43.6 MB, less than 5.21% of Java online submissions for Longest Increasing Subsequence*/
public class Longest_Increasing_Subsequence_300 {

    public int lengthOfLIS(int[] nums) {
        Map<Integer, Integer> index = new HashMap<>();
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        for (int i : nums) {
            Optional<Integer> val = Optional.ofNullable(tree.lowerKey(i));
            int ind = (val.isPresent() ? tree.get(val.get()) : 0) + 1;
            if (index.get(ind) != null) tree.remove(index.get(ind));
            tree.put(i, ind);
            index.put(ind, i);
        }
        return index.size();
    }

}
