package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

/*https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
        Runtime: 13 ms, faster than 88.65% of Java online submissions for All Elements in Two Binary Search Trees.
        Memory Usage: 42.1 MB, less than 74.78% of Java online submissions for All Elements in Two Binary Search Trees.*/
public class All_Elements_in_Two_Binary_Search_Trees_1305 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    private List<Integer> inorder(TreeNode root, List<Integer> result) {
        if (root != null) {
            inorder(root.left, result);
            result.add(root.val);
            inorder(root.right, result);
        };
        return result;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> vals1 = inorder(root1, new ArrayList<>());
        List<Integer> vals2 = inorder(root2, new ArrayList<>());
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = 0;
        for(;left < vals1.size() && right < vals2.size();) {
            if (vals1.get(left) <= vals2.get(right)) result.add(vals1.get(left++));
            else result.add(vals2.get(right++));
        };
        if (left == vals1.size()) result.addAll(vals2.subList(right, vals2.size()));
        else result.addAll(vals1.subList(left, vals1.size()));
        return result;
    }
}
