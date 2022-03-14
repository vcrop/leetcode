package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for N-ary Tree Preorder Traversal.
        Memory Usage: 43.3 MB, less than 69.55% of Java online submissions for N-ary Tree Preorder Traversal.*/
public class N_ary_Tree_Preorder_Traversal_589 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };



        private List<Integer> solution(Node root, List<Integer> result) {
            if (root == null) return result;
            result.add(root.val);
            for (Node child: root.children)
                solution(child, result);
            return result;
        }

        public List<Integer> preorder(Node root) {
            return solution(root, new ArrayList<>());
        }
}
