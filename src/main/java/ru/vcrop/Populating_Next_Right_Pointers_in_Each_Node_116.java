package ru.vcrop;

import java.util.Deque;
import java.util.LinkedList;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

/*
https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
Runtime: 0 ms, faster than 100.00% of Java online submissions for Populating Next Right Pointers in Each Node.
Memory Usage: 39.1 MB, less than 85.97% of Java online submissions for Populating Next Right Pointers in Each Node.
*/

public class Populating_Next_Right_Pointers_in_Each_Node_116 {

    public Node implementation(Node root, Deque<Node> deque) {
        if (root == null) return null;
        if (!deque.isEmpty()) root.next = deque.pop();
        implementation(root.right, deque);
        implementation(root.left, deque);
        deque.push(root);
        return root;
    }

    public Node connect(Node root) {
        return implementation(root, new LinkedList<>());
    }

}
