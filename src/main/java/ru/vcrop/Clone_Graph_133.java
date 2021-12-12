package ru.vcrop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node1 {
    public int val;
    public List<Node1> neighbors;
    public Node1() {
        val = 0;
        neighbors = new ArrayList<Node1>();
    }
    public Node1(int _val) {
        val = _val;
        neighbors = new ArrayList<Node1>();
    }
    public Node1(int _val, ArrayList<Node1> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

/*
https://leetcode.com/problems/clone-graph/submissions/
Runtime: 24 ms, faster than 98.77% of Java online submissions for Clone Graph.
Memory Usage: 38.8 MB, less than 96.64% of Java online submissions for Clone Graph.
*/

public class Clone_Graph_133 {

    private Node1 implementation(Node1 node, Map<Integer, Node1> map) {
        if (node == null) return null;
        Node1 new_node = new Node1(node.val, new ArrayList<>());
        map.put(node.val, new_node);
        for (Node1 n: node.neighbors)
            if (!map.containsKey(n.val)) new_node.neighbors.add(implementation(n, map));
            else new_node.neighbors.add(map.get(n.val));
        return new_node;
    }

    public Node1 cloneGraph(Node1 node) {
        return implementation(node, new HashMap<>());
    }
}
