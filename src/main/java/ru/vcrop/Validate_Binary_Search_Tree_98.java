package ru.vcrop;

public class Validate_Binary_Search_Tree_98 {

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

        private boolean solution(TreeNode root, int low, int high) {
            if (root == null) return true;
            if (root.val <= low || root.val >= high) return false;
            return solution(root.left, low, Math.min(high, root.val)) &&
                    solution(root.right, Math.max(low, root.val), high);
        }

        public boolean isValidBST(TreeNode root) {
            return solution(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
}
