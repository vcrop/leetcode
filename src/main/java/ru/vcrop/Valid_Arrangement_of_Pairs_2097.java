package ru.vcrop;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Valid_Arrangement_of_Pairs_2097 {

    private int[][] solution(int[][] pairs, Set<Integer> visited, int expected, int current, int depth, Map<Integer, List<Integer>> map) {
        if (!visited.contains(current)) {
            if (depth == pairs.length - 1) {
                int[][] ret = new int[depth + 1][];
                ret[depth] = pairs[current];
                return ret;
            }
            visited.add(current);
            if (map.containsKey(pairs[current][1]))
                for (int i : map.get(pairs[current][1])) {
                    int[][] ret = solution(pairs, visited, pairs[current][1], i, depth + 1, map);
                    if (ret != null) {
                        ret[depth] = pairs[current];
                        return ret;
                    }
                }
            visited.remove(current);
        }
        return null;
    }

    public int[][] validArrangement(int[][] pairs) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < pairs.length; i++)
            map.computeIfAbsent(pairs[i][0], k -> new ArrayList<>()).add(i);

        for (int k : map.keySet())
            if (map.get(k).size() % 2 == 1)
                for (int i : map.get(k)) {
                    int[][] ret = solution(pairs, new HashSet<>(), pairs[i][0], i, 0, map);
                    if (ret != null) return ret;
                }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.deepToString(new Valid_Arrangement_of_Pairs_2097().validArrangement(
                        new int[][]{{5, 1}, {4, 5}, {11, 9}, {9, 4}}
                ))
        );
    }
}
