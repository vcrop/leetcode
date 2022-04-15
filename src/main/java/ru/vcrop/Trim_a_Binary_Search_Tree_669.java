package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Trim a Binary Search Tree.
        Memory Usage: 42.2 MB, less than 80.88% of Java online submissions for Trim a Binary Search Tree.*/

public class Trim_a_Binary_Search_Tree_669 {

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

        public TreeNode trimBST(TreeNode root, int low, int high) {
            if (root == null) return null;
            if (root.val >= low && root.val <= high) {
                root.left = trimBST(root.left, low, high);
                root.right = trimBST(root.right, low, high);
                return root;
            };
            if (root.val < low) return trimBST(root.right, low, high);
            return trimBST(root.left, low, high);
        }
}
