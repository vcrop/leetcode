package ru.vcrop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Runtime: 2 ms, faster than 89.85% of Java online submissions for Permutations II.
        Memory Usage: 43.1 MB, less than 80.65% of Java online submissions for Permutations II.*/
public class Permutations_II_47 {

    public void sol(int[] nums, boolean[] visited, List<Integer> in, List<List<Integer>> ret) {
        if (in.size() == nums.length) ret.add(in);
        else
            for (int i = 0; i < nums.length; i++)
                if (!visited[i] && (i == 0 || nums[i - 1] != nums[i] || visited[i - 1])) {
                    visited[i] = true;
                    int j = i;
                    sol(nums, visited, new ArrayList<>(in) {{
                        add(nums[j]);
                    }}, ret);
                    visited[i] = false;
                }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
        sol(nums, new boolean[nums.length], List.of(), ret);
        return ret;
    }

}
