package ru.vcrop;

import java.util.HashSet;
import java.util.Set;

/*https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/
        Runtime: 18 ms, faster than 87.24% of Java online submissions for Find Elements in a Contaminated Binary Tree.
        Memory Usage: 43.8 MB, less than 62.76% of Java online submissions for Find Elements in a Contaminated Binary Tree.*/
public class Find_Elements_in_a_Contaminated_Binary_Tree_1261 {

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

    Set<Integer> vertex = new HashSet<>();

    private void fill(TreeNode root, int val) {
        if (root == null) return;
        vertex.add(val);
        fill(root.left, val * 2 + 1);
        fill(root.right, val * 2 + 2);
    }

    public Find_Elements_in_a_Contaminated_Binary_Tree_1261(TreeNode root) {
        fill(root, 0);
    }

    public boolean find(int target) {
        return vertex.contains(target);
    }
}
