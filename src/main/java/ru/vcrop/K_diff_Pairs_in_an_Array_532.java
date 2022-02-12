package ru.vcrop;

import java.util.HashSet;
import java.util.Set;

/*https://leetcode.com/problems/k-diff-pairs-in-an-array/
Runtime: 10 ms, faster than 72.31% of Java online submissions for K-diff Pairs in an Array.
        Memory Usage: 49.1 MB, less than 18.27% of Java online submissions for K-diff Pairs in an Array.*/
public class K_diff_Pairs_in_an_Array_532 {

    public int findPairs(int[] nums, int k) {
        int count = 0;
        Set<Integer> visited = new HashSet<>();
        Set<Integer> zeros = new HashSet<>();
        for (int i: nums) {
            if (k == 0 && visited.contains(i))
                if (zeros.add(i)) count++;
            if (!visited.contains(i)) {
                if (visited.contains(k + i)) count++;
                if (visited.contains(i - k)) count++;
            };
            visited.add(i);
        };
        return count;
    }
}
