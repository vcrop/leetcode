package ru.vcrop;

/*https://leetcode.com/problems/range-sum-of-bst/
        Runtime: 1 ms, faster than 51.60% of Java online submissions for Range Sum of BST.
        Memory Usage: 47.2 MB, less than 81.13% of Java online submissions for Range Sum of BST.*/
public class Range_Sum_of_BST_938 {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high) +
                (root.val >= low && root.val <= high ? root.val : 0);
    }

}
