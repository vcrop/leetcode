package ru.vcrop;

/*Runtime: 1 ms, faster than 99.95% of Java online submissions for Construct Binary Tree from Inorder and Postorder Traversal.
        Memory Usage: 45.3 MB, less than 8.60% of Java online submissions for Construct Binary Tree from Inorder and Postorder Traversal.*/
public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal_106 {

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

        @Override
        public String toString() {
            return Integer.toString(val) + " left " + left + " right " + right;
        }
    }

    private TreeNode solution(int[] inorder, int[] pos, int[] postorder, int[] from, int expected) {
        TreeNode pred = null;
        TreeNode root = null;
        while (pos[0] < inorder.length) {
            while (inorder[pos[0]] == postorder[from[0]]) {
                root = new TreeNode(inorder[pos[0]]);
                root.left = pred;
                pred = root;
                pos[0]++;
                from[0]++;
                if (pos[0] == inorder.length) return root;
            }
            if (postorder[from[0]] == expected) {
                from[0]++;
                return root;
            }
            root = new TreeNode(inorder[pos[0]]);
            root.left = pred;
            pos[0]++;
            root.right = solution(inorder, pos, postorder, from, root.val);
            pred = root;
        }
        return null;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return solution(inorder, new int[]{0}, postorder, new int[]{0}, Integer.MIN_VALUE);
    }

}
