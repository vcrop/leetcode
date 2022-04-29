package ru.vcrop;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*Runtime: 7 ms, faster than 13.11% of Java online submissions for Is Graph Bipartite?.
        Memory Usage: 53.8 MB, less than 47.00% of Java online submissions for Is Graph Bipartite?.*/
public class Is_Graph_Bipartite_785 {

    public boolean isBipartite(int[][] graph) {
        Map<Integer,Integer> groups = new HashMap<>();

        for (int count = 0; count < graph.length; count++)
            if (!groups.containsKey(count)) {
                groups.put(count, 0);
                Deque<Integer> deque = new LinkedList<>();
                deque.push(count);
                while (!deque.isEmpty()) {
                    int vertex = deque.pop();
                    for (int v: graph[vertex]) {
                        if (!groups.containsKey(v)) {
                            groups.put(v, 1 - groups.get(vertex));
                            deque.push(v);
                        }
                        if (groups.get(v).equals(groups.get(vertex))) return false;
                    }

                }
            }
        return true;
    }
}
