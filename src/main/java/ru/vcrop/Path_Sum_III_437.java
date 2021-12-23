package ru.vcrop;

import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/path-sum-iii/
        Runtime: 2 ms, faster than 100.00% of Java online submissions for Path Sum III.
        Memory Usage: 38.8 MB, less than 76.74% of Java online submissions for Path Sum III.*/
public class Path_Sum_III_437 {

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

    private int solution(TreeNode root, Map<Integer, Integer> sums, int sum, int targetSum) {
        if (root == null) return 0;
        int result = 0;
        sum += root.val;
        if (sum == targetSum) result = 1;
        result += sums.getOrDefault(sum - targetSum, 0);
        sums.merge(sum, 1, Integer::sum);
        result += solution(root.left, sums, sum, targetSum);
        result += solution(root.right, sums, sum, targetSum);
        sums.put(sum, sums.get(sum) - 1);
        return result;
    }

    public int pathSum(TreeNode root, int targetSum) {
        return solution(root, new HashMap<>(), 0, targetSum);
    }

}
