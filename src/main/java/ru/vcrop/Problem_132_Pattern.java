package ru.vcrop;

import java.util.TreeMap;

public class Problem_132_Pattern {

    public boolean find132pattern(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for (int i: nums) {
                int firstKey = map.isEmpty() ? Integer.MAX_VALUE : map.firstKey();
                if (firstKey > i) map.put(i, i + 1);
                else if (map.get(firstKey) > i) return true;
                else map.put(firstKey, i);
        }

        return false;
    }
}
