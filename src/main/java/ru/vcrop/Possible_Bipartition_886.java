package ru.vcrop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*https://leetcode.com/problems/possible-bipartition/
Runtime: 26 ms, faster than 71.24% of Java online submissions for Possible Bipartition.
        Memory Usage: 49.9 MB, less than 74.44% of Java online submissions for Possible Bipartition.*/
public class Possible_Bipartition_886 {

    class Node {
        int color = -1;
        Set<Node> leaves = new HashSet<>();
    }

    private boolean isNotValid(Node node) {
        boolean result = true;
        for(Node leaf: node.leaves) {
            if (leaf.color == node.color) return true;
            if (leaf.color == -1) {
                leaf.color = 1 - node.color;
                if (isNotValid(leaf)) return true;
            }
        }
        return false;
    }

    public boolean possibleBipartition(int n, int[][] dislikes) {

        Node[] nodes = new Node[n];
        Arrays.setAll(nodes, i -> new Node());

        for (int[] dislike: dislikes) {
            nodes[dislike[0] - 1].leaves.add(nodes[dislike[1] - 1]);
            nodes[dislike[1] - 1].leaves.add(nodes[dislike[0] - 1]);
        }

        for(Node node: nodes) {
            if (node.color == -1) {
                node.color = 0;
                if (isNotValid(node)) return false;
            }
        }

        return true;
    }
}
