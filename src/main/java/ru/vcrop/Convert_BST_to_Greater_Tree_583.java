package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert BST to Greater Tree.
        Memory Usage: 42.4 MB, less than 90.48% of Java online submissions for Convert BST to Greater Tree.*/
public class Convert_BST_to_Greater_Tree_583 {

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

        private int solution(TreeNode root, int n) {
            if (root == null) return n;
            root.val += solution(root.right, n);
            return solution(root.left, root.val);
        }

        public TreeNode convertBST(TreeNode root) {
            solution(root, 0);
            return root;
        }
    }
