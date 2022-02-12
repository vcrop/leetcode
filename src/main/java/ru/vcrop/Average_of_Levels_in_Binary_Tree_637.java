package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

/*https://leetcode.com/problems/average-of-levels-in-binary-tree/
Runtime: 1 ms, faster than 100.00% of Java online submissions for Average of Levels in Binary Tree.
        Memory Usage: 43.4 MB, less than 69.07% of Java online submissions for Average of Levels in Binary Tree.*/
public class Average_of_Levels_in_Binary_Tree_637 {

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

        class M {
            int count;
            long sum;

            public M(long sum) {
                this.sum = sum;
                this.count = 1;
            }
        }

        public List<M> solution(TreeNode root, int deep, List<M> result) {
            if (root == null) return result;
            if (result.size() < deep) result.add(new M(root.val));
            else {
                M m = result.get(deep - 1);
                m.count++;
                m.sum += root.val;
            }
            solution(root.left, deep + 1, result);
            return solution(root.right, deep + 1, result);
        }

        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> res = new ArrayList<>();
            for (M m: solution(root, 1, new ArrayList<>()))
                res.add((double) m.sum / m.count);
            return res;
        }
}
