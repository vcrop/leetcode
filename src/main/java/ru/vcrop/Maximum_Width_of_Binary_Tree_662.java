package ru.vcrop;

import java.util.Deque;
import java.util.LinkedList;


/*Runtime: 1 ms, faster than 99.23% of Java online submissions for Maximum Width of Binary Tree.
        Memory Usage: 41.6 MB, less than 96.47% of Java online submissions for Maximum Width of Binary Tree.*/
public class Maximum_Width_of_Binary_Tree_662 {

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

    private int solution(TreeNode root, int val, Deque<Integer> deque) {
        if (root == null) return 0;
        int tmp = deque.isEmpty() ? val : deque.pop();
        int ret_left = solution(root.left, 2 * val - 1, deque);
        int ret_right = solution(root.right, 2 * val, deque);
        deque.push(tmp);
        return Math.max(val - tmp + 1, Math.max(ret_left, ret_right));
    }

    public int widthOfBinaryTree(TreeNode root) {
        return solution(root, 1, new LinkedList<>());
    }
}
