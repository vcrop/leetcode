package ru.vcrop;

import java.util.Deque;
import java.util.LinkedList;

/*Runtime: 2 ms, faster than 41.79% of Java online submissions for Populating Next Right Pointers in Each Node II.
        Memory Usage: 44.8 MB, less than 51.46% of Java online submissions for Populating Next Right Pointers in Each Node II.*/
public class Populating_Next_Right_Pointers_in_Each_Node_II_117 {

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }


    private Node sol(Node root, Deque<Node> deque) {
        if (root == null) return null;
        if (!deque.isEmpty()) deque.pop().next = root;
        sol(root.left, deque);
        sol(root.right, deque);
        deque.push(root);
        return root;
    }

    public Node connect(Node root) {
        return sol(root, new LinkedList<>());
    }
}
