package ru.vcrop;

/*https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Root To Leaf Binary Numbers.
        Memory Usage: 39.3 MB, less than 25.98% of Java online submissions for Sum of Root To Leaf Binary Numbers.*/
public class Sum_of_Root_To_Leaf_Binary_Numbers_1022 {

    private int solution(Binary_Search_Tree_Iterator_173.TreeNode root, int val) {
        int res = 0;
        if (root.left != null) res += solution(root.left, val * 2 + root.val);
        if (root.right != null) res += solution(root.right, val * 2 + root.val);
        if (root.left == null && root.right == null) return val * 2 + root.val;
        return res;
    }

    public int sumRootToLeaf(Binary_Search_Tree_Iterator_173.TreeNode root) {
        return solution(root, 0);
    }
}
