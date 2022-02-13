package ru.vcrop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*https://leetcode.com/problems/subsets
Runtime: 1 ms, faster than 77.93% of Java online submissions for Subsets.
        Memory Usage: 44 MB, less than 6.35% of Java online submissions for Subsets.*/
public class Subsets_78 {

    public List<List<Integer>> subsets(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(1 << i, nums[i]);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < (1 << nums.length); i++) {
            int j = i;
            List<Integer> tmp = new ArrayList<>();
            int pos = j & -j;
            while (pos != 0) {
                j ^= pos;
                tmp.add(map.get(pos));
                pos = j & -j;
            }
            result.add(tmp);
        }
        return result;
    }
}
