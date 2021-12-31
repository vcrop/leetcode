package ru.vcrop;

/*https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Difference Between Node and Ancestor.
        Memory Usage: 39.4 MB, less than 75.53% of Java online submissions for Maximum Difference Between Node and Ancestor.*/
public class Maximum_Difference_Between_Node_and_Ancestor_1026 {

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

    private int solution(TreeNode root, int min, int max) {
        if (root == null) return 0;
        min = Math.min(root.val, min);
        max = Math.max(root.val, max);
        return Math.max(max - min, Math.max(solution(root.left, min, max), solution(root.right, min, max)));
    }

    public int maxAncestorDiff(TreeNode root) {
        return solution(root, 1_000_000, -1_000_000);
    }
}
