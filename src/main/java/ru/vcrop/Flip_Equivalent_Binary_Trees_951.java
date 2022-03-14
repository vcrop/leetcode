package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Flip Equivalent Binary Trees.
        Memory Usage: 41.8 MB, less than 47.28% of Java online submissions for Flip Equivalent Binary Trees.*/
public class Flip_Equivalent_Binary_Trees_951 {

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

        public boolean flipEquiv(TreeNode root1, TreeNode root2) {
            if ((root1 != null) ^ (root2 != null)) return false;
            if (root1 == null) return true;
            if (root1.val != root2.val) return false;
            return (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left)) ||
                    (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right));
        }
}
