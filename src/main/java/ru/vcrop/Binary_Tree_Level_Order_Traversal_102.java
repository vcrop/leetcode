package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Level_Order_Traversal_102 {

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return List.of();
        List<TreeNode> current = List.of(root);
        List<List<Integer>> ret = new ArrayList<>();

        while (!current.isEmpty()) {
            List<TreeNode> tmp = new ArrayList<>();
            List<Integer> r = new ArrayList<>();
            for (TreeNode tn : current) {
                r.add(tn.val);
                if (tn.left != null) tmp.add(tn.left);
                if (tn.right != null) tmp.add(tn.right);
            }
            ret.add(r);
            current = tmp;
        }

        return ret;
    }
}
