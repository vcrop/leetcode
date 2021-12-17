package ru.vcrop;

import java.util.HashSet;
import java.util.Set;

/*https://leetcode.com/problems/contains-duplicate/
        Runtime: 4 ms, faster than 82.75% of Java online submissions for Contains Duplicate.
        Memory Usage: 52.1 MB, less than 20.10% of Java online submissions for Contains Duplicate.*/
public class Contains_Duplicate_217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        for (int i: nums) if (!visited.add(i)) return true;
        return false;
    }

}
