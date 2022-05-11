package ru.vcrop;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
/*
Runtime: 1 ms, faster than 93.77% of Java online submissions for Permutations.
        Memory Usage: 42.5 MB, less than 87.14% of Java online submissions for Permutations.*/
public class Permutations_46 {

    private void sol(int[] nums, boolean[] nextClear, List<List<Integer>> ret, List<Integer> list, int pos) {
        if (pos == nums.length) ret.add(list);
        for (int i = 0; i < nums.length; i++)
            if (!nextClear[i]) {
                int j = i;
                nextClear[i] = true;
                sol(nums, nextClear, ret, new ArrayList<>(list) {{ add(nums[j]); }}, pos + 1);
                nextClear[i] = false;
            }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        sol(nums, new boolean[nums.length], ret, List.of(), 0);
        return ret;
    }

    public static void main(String[] args) {
        new Permutations_46().permute(new int[]{1, 2, 3});
    }
}
