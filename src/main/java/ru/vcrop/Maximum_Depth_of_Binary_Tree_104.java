package ru.vcrop;

/*https://leetcode.com/problems/maximum-depth-of-binary-tree/
Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
        Memory Usage: 42.2 MB, less than 23.84% of Java online submissions for Maximum Depth of Binary Tree.*/
public class Maximum_Depth_of_Binary_Tree_104 {

    public class TreeNode {
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

        public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
}
