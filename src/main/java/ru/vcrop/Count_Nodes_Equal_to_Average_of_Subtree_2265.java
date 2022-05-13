package ru.vcrop;

/*Runtime: 1 ms, faster than 99.05% of Java online submissions for Count Nodes Equal to Average of Subtree.
        Memory Usage: 42.1 MB, less than 84.14% of Java online submissions for Count Nodes Equal to Average of Subtree.*/
public class Count_Nodes_Equal_to_Average_of_Subtree_2265 {

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


    private int[] sol(TreeNode root) {
        if (root == null) return new int[]{0, 0, 0};
        int[] left = sol(root.left);
        int[] right = sol(root.right);
        left[0] += right[0] + root.val;
        left[1] += right[1] + 1;
        left[2] += right[2] + (left[0] / left[1] == root.val ? 1 : 0);
        return left;
    }

    public int averageOfSubtree(TreeNode root) {
        return sol(root)[2];
    }
}
