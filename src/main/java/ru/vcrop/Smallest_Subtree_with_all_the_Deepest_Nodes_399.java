package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Smallest Subtree with all the Deepest Nodes.
        Memory Usage: 40.5 MB, less than 81.63% of Java online submissions for Smallest Subtree with all the Deepest Nodes.*/
public class Smallest_Subtree_with_all_the_Deepest_Nodes_399 {

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

    private Object[] solution(TreeNode root, int depth){
        if (root == null) return null;
        Object[] left = solution(root.left, depth + 1);
        Object[] right = solution(root.right, depth + 1);
        return left != null && right != null ?
                (int) left[1] > (int) right[1] ? left :
                        (int) left[1] < (int) right[1] ? right :
                                new Object[]{root, left[1]} :
                (left == null && right == null ? new Object[]{root, depth} :
                        left != null ? left : right);
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return (TreeNode) solution(root, 0)[0];
    }

}
