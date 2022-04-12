package ru.vcrop;

/*Runtime: 11 ms, faster than 5.66% of Java online submissions for Longest Univalue Path.
        Memory Usage: 72.7 MB, less than 5.00% of Java online submissions for Longest Univalue Path.*/
public class Longest_Univalue_Path_687 {

    public static class TreeNode {
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

    private static class Ret {
        int max;
        int current;
        TreeNode value;

        public Ret(int max, int current, TreeNode value) {
            this.max = max;
            this.current = current;
            this.value = value;
        }

    }

    private Ret solution(TreeNode root) {
        if (root == null) return null;
        int sum = 0;
        int c = 0;
        Ret left = solution(root.left);
        if (left != null && left.value.val == root.val) {
            sum += left.current + 1;
            c += left.current + 1;
        }
        Ret right = solution(root.right);
        if (right != null && right.value.val == root.val) {
            c = Math.max(right.current + 1, c);
            sum += right.current + 1;
        }
        int max = Math.max(left == null ? Integer.MIN_VALUE : left.max,
                Math.max(right == null ? Integer.MIN_VALUE : right.max, sum));
        int current = Math.max(left == null ? Integer.MIN_VALUE : left.max, right == null ? Integer.MIN_VALUE : right.max) + 1;
        return new Ret(max, c, root);
    }

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        Ret ret = solution(root);
        return ret.max;
    }
}
