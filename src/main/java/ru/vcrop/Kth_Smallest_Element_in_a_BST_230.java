package ru.vcrop;


/*https://leetcode.com/problems/kth-smallest-element-in-a-bst/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Kth Smallest Element in a BST.
        Memory Usage: 38.3 MB, less than 99.23% of Java online submissions for Kth Smallest Element in a BST*/
public class Kth_Smallest_Element_in_a_BST_230 {

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

    private int[] implementation(TreeNode root, int k) {
        if (root == null) return new int[]{0, k};
        int[] res = implementation(root.left, k);
        if (res[1] == 0) return res;
        if (--res[1] == 0) return new int[]{root.val, 0};
        return implementation(root.right, res[1]);
    }

    public int kthSmallest(TreeNode root, int k) {
        return implementation(root, k)[0];
    }

}
