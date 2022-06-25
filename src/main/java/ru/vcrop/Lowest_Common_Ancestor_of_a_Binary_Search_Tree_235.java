package ru.vcrop;

public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235 {

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


    public boolean impl(TreeNode root, Integer min, Integer max) {
        return root == null || ((min == null || root.val > min) && (max == null || root.val < max)) &&
                (impl(root.left, min, max == null ? root.val : Math.min(max, root.val)) &&
                        impl(root.right, min == null ? root.val : Math.max(min, root.val), max));
    }

    public boolean isValidBST(TreeNode root) {
        return impl(root, null, null);
    }
}
