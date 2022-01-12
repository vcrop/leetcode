package ru.vcrop;

/*https://leetcode.com/problems/insert-into-a-binary-search-tree/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Insert into a Binary Search Tree.
        Memory Usage: 51.5 MB, less than 21.88% of Java online submissions for Insert into a Binary Search Tree.*/
public class Insert_into_a_Binary_Search_Tree_701 {


    private Binary_Search_Tree_Iterator_173.TreeNode solution(Binary_Search_Tree_Iterator_173.TreeNode root, Binary_Search_Tree_Iterator_173.TreeNode node) {
        if (root == null) return node;
        if (node.val > root.val) root.right = solution(root.right, node);
        if (node.val < root.val) root.left = solution(root.left, node);
        return root;
    }
    public Binary_Search_Tree_Iterator_173.TreeNode insertIntoBST(Binary_Search_Tree_Iterator_173.TreeNode root, int val) {
        return solution(root, new Binary_Search_Tree_Iterator_173.TreeNode(val));
    }
}
