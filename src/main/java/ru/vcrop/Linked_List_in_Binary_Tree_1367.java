package ru.vcrop;

import java.util.HashSet;
import java.util.Set;


/*https://leetcode.com/problems/linked-list-in-binary-tree/
        Runtime: 4 ms, faster than 14.60% of Java online submissions for Linked List in Binary Tree.
        Memory Usage: 39.8 MB, less than 35.25% of Java online submissions for Linked List in Binary Tree.*/
public class Linked_List_in_Binary_Tree_1367 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private boolean solution(ListNode head, Set<ListNode> deque, TreeNode root) {
        if (root == null) return false;
        Set<ListNode> tmp = new HashSet<>();
        if (root.val == head.val) tmp.add(head.next);
        for (ListNode l : deque) {
            if (l == null) return true;
            if (l.val == root.val) {
                if (l.next == null) return true;
                tmp.add(l.next);
            }
        }
        return solution(head, tmp, root.left) || solution(head, tmp, root.right);
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        return solution(head, new HashSet<>(), root);
    }
}
