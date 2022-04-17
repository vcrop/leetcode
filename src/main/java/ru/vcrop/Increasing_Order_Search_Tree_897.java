package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Increasing Order Search Tree.
        Memory Usage: 39.7 MB, less than 95.34% of Java online submissions for Increasing Order Search Tree.*/
public class Increasing_Order_Search_Tree_897 {

    private void compile(TreeNode root, List<TreeNode> list) {
        if (root == null) return;
        compile(root.left, list);
        list.add(root);
        compile(root.right, list);
    }

    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        compile(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).left = null;
            list.get(i).right = list.get(i + 1);
        }
        list.get(list.size() - 1).left = null;
        return list.get(0);
    }
}
