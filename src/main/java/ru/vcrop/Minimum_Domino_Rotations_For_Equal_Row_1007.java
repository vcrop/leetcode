package ru.vcrop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Minimum_Domino_Rotations_For_Equal_Row_1007 {

    public int minDominoRotations(int[] tops, int[] bottoms) {

        Map<Integer,Integer> tops_map = new HashMap<>();

        int duplicate = 0;

        tops_map.put(tops[0], 0);
        tops_map.put(bottoms[0], 0);

        for (int i = 0; i < tops.length; i++) {
            Set<Integer> keys = new HashSet<>(tops_map.keySet());
            for (int val : keys) {
                if (val != tops[i] && val != bottoms[i]) tops_map.remove(val);
                else if (tops[i] == bottoms[i]) {
                    duplicate++;
                } else if (val == tops[i]) tops_map.merge(val, 1, (a, b) -> a + 1);
            }
        }
        if (tops_map.isEmpty()) return -1;

        int val = tops_map.keySet().iterator().next();

        return Math.min(tops_map.getOrDefault(val, 0), tops.length - tops_map.getOrDefault(val, 0) - duplicate);

    }
}
