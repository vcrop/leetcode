package ru.vcrop;

import java.util.ArrayList;
import java.util.List;
/*
https://leetcode.com/problems/combination-sum/
Runtime: 5 ms, faster than 62.10% of Java online submissions for Combination Sum.
        Memory Usage: 45.9 MB, less than 11.47% of Java online submissions for Combination Sum.*/
public class Combination_Sum_39 {

    private List<List<Integer>> solution(int[] candidates, int target, int pos) {
        if (target == 0) return new ArrayList<>() {{ add(new ArrayList<>()); }};
        if (target < 0) return null;
        List<List<Integer>> result = null;
        for (int i = pos; i < candidates.length; i++) {
            List<List<Integer>> ret = solution(candidates, target - candidates[i], i);
            if (ret != null) {
                if (result == null) result = new ArrayList<>();
                for (List<Integer> j: ret) j.add(candidates[i]);
                result.addAll(ret);
            }
        }
        return result;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret = solution(candidates, target, 0);
        return ret == null ? List.of() : ret;
    }
}
