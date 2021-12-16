package ru.vcrop;

import java.util.Deque;
import java.util.LinkedList;


/*https://leetcode.com/problems/binary-search-tree-iterator/
        Runtime: 20 ms, faster than 27.47% of Java online submissions for Binary Search Tree Iterator.
        Memory Usage: 49.1 MB, less than 15.31% of Java online submissions for Binary Search Tree Iterator.*/
public class Binary_Search_Tree_Iterator_173 {

    public static class TreeNode {
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

    Deque<TreeNode> deque;

    public void fillLeftSide(TreeNode root, Deque<TreeNode> deque) {
        if (root == null) return;
        deque.push(root);
        fillLeftSide(root.left, deque);
    }

    public Binary_Search_Tree_Iterator_173(TreeNode root) {
        deque = new LinkedList<>();
        fillLeftSide(root, deque);
    }

    public int next() {
        TreeNode ret = deque.pop();
        fillLeftSide(ret.right, deque);
        return ret.val;
    }

    public boolean hasNext() {
        return !deque.isEmpty();
    }
}
