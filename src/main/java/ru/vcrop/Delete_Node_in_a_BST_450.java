package ru.vcrop;

/*https://leetcode.com/problems/delete-node-in-a-bst/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a BST.
        Memory Usage: 39.6 MB, less than 66.92% of Java online submissions for Delete Node in a BST.*/
public class Delete_Node_in_a_BST_450 {

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

    private TreeNode getRightTail(TreeNode root) {
        if (root.left == null) return root;
        return getRightTail(root.left);
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key) {
            if (root.right == null) return root.left;
            getRightTail(root.right).left = root.left;
            return root.right;
        }

        if (root.val < key) root.right = deleteNode(root.right, key);
        root.left = deleteNode(root.left, key);
        return root;
    }

}
