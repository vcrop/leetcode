package ru.vcrop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*https://leetcode.com/problems/minimum-height-trees/
        Runtime: 40 ms, faster than 18.03% of Java online submissions for Minimum Height Trees.
        Memory Usage: 43.8 MB, less than 44.62% of Java online submissions for Minimum Height Trees.*/
public class Minimum_Height_Trees_310 {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return List.of(0);
        Map<Integer, Set<Integer>> map = Stream.of(edges)
                .flatMap(e -> Stream.of(new int[]{e[0], e[1]}, new int[]{e[1], e[0]}))
                .collect(Collectors.groupingBy(e -> e[0], Collectors.mapping(e -> e[1], Collectors.toSet())));
        List<Integer> current = map.keySet().stream().filter(k -> map.get(k).size() == 1).collect(Collectors.toList());
        while (map.size() > 2) {
            List<Integer> tmp = new ArrayList<>();
            for (int val: current) {
                for (int neighborn: map.get(val)) {
                    map.get(neighborn).remove(val);
                    if (map.get(neighborn).size() == 1) tmp.add(neighborn);
                }
                map.remove(val);
            }
            current = tmp;
        }
        return new ArrayList<>(map.keySet());
    }

}
