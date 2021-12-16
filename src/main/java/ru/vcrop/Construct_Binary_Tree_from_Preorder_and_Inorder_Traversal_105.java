package ru.vcrop;

import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
        Runtime: 4 ms, faster than 34.65% of Java online submissions for Construct Binary Tree from Preorder and Inorder Traversal.
        Memory Usage: 42.1 MB, less than 9.12% of Java online submissions for Construct Binary Tree from Preorder and Inorder Traversal.*/
public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal_105 {
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

    public TreeNode implementation(int[] preorder, Map<Integer, Integer> inorder, int from, int to, int[] preorder_index) {
        if (from == to) return null;
        int val = preorder[preorder_index[0]++];
        return new TreeNode(val,
                implementation(preorder, inorder, from, inorder.get(val), preorder_index),
                implementation(preorder, inorder, inorder.get(val) + 1, to, preorder_index));
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) map.put(inorder[i], i);
        return implementation(preorder, map, 0, inorder.length, new int[]{0});
    }

}
