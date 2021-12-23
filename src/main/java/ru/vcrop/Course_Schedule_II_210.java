package ru.vcrop;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/*https://leetcode.com/problems/course-schedule-ii/
        Runtime: 16 ms, faster than 19.08% of Java online submissions for Course Schedule II.
        Memory Usage: 40.6 MB, less than 36.53% of Java online submissions for Course Schedule II.*/
public class Course_Schedule_II_210 {

    private void sortingTarjan(Map<Integer,Set<Integer>> graph,
                               int root,
                               Set<Integer> white,
                               Set<Integer> gray,
                               Set<Integer> black,
                               Deque<Integer> result) {
        if (black.contains(root)) return;
        if (gray.contains(root)) throw new IllegalArgumentException("Circle graph");
        gray.add(root);
        white.remove(root);
        if (graph.get(root) != null)
            for (int next: graph.get(root))
                sortingTarjan(graph, next, white, gray, black, result);
        gray.remove(root);
        black.add(root);
        result.push(root);
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, Set<Integer>> graph = Stream.of(prerequisites)
                .collect(Collectors.groupingBy(p -> p[1], Collectors.mapping(p -> p[0], Collectors.toSet())));
        IntStream.range(0, numCourses).forEach(n -> {if (!graph.containsKey(n)) graph.put(n , null); });
        Deque<Integer> result = new LinkedList<>();
        Set<Integer> white = new HashSet<>(graph.keySet());
        Set<Integer> gray = new HashSet<>();
        Set<Integer> black = new HashSet<>();
        try{
            for (int root: graph.keySet())
                sortingTarjan(graph, root, white, gray, black, result);
        } catch (IllegalArgumentException ex) {
            return new int[]{};
        }
        if (result.size() == numCourses)
            return result.stream().mapToInt(i -> i).toArray();
        return new int[]{};
    }
    
}
