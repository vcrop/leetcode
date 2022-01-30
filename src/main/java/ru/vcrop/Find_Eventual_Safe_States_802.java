package ru.vcrop;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*https://leetcode.com/problems/find-eventual-safe-states/
Runtime: 36 ms, faster than 38.98% of Java online submissions for Find Eventual Safe States.
        Memory Usage: 50.8 MB, less than 58.58% of Java online submissions for Find Eventual Safe States.*/
public class Find_Eventual_Safe_States_802 {

    private boolean solution(int root, int[][] graph, Set<Integer> notSafe, Set<Integer> save, Set<Integer> visited) {
        if (visited.contains(root) || notSafe.contains(root)) return false;
        if (save.contains(root)) return true;
        visited.add(root);
        boolean isSafe = true;
        for (int edge: graph[root])
            isSafe &= solution(edge, graph, notSafe, save, visited);
        visited.remove(root);
        if (!isSafe) {
            notSafe.add(root);
            return false;
        };
        save.add(root);
        return true;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        Set<Integer> notSafe = new HashSet<>(),
                save = new HashSet<>(),
                visited = new HashSet<>();
        for (int i = 0; i < graph.length; i++)
            solution(i, graph, notSafe, save, visited);
        return IntStream.range(0, graph.length).filter(n -> !notSafe.contains(n)).boxed().collect(Collectors.toList());
    }
}
