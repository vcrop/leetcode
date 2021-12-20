package ru.vcrop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*https://leetcode.com/problems/minimum-absolute-difference/
        Runtime: 14 ms, faster than 97.12% of Java online submissions for Minimum Absolute Difference.
        Memory Usage: 49.4 MB, less than 98.97% of Java online submissions for Minimum Absolute Difference.*/
public class Minimum_Absolute_Difference_1200 {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) min = Math.min(min, arr[i + 1] - arr[i]);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i + 1] - arr[i] == min) result.add(List.of(arr[i], arr[i + 1]));

        return result;
    }

}
