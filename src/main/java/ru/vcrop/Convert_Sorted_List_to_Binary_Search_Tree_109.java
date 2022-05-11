package ru.vcrop;

import java.util.ArrayList;
import java.util.List;

/*Runtime: 2 ms, faster than 24.67% of Java online submissions for Convert Sorted List to Binary Search Tree.
        Memory Usage: 47.2 MB, less than 41.86% of Java online submissions for Convert Sorted List to Binary Search Tree.*/
public class Convert_Sorted_List_to_Binary_Search_Tree_109 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



  public static class TreeNode {
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

    private TreeNode solution(List<Integer> list, int from, int to) {
        if (from > to) return null;
        if (from == to) return new TreeNode(list.get(from));
        int pos = (to + from) / 2;
        return new TreeNode(list.get(pos), solution(list, from, pos - 1), solution(list, pos + 1, to));
    }

    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        };

        return solution(list, 0, list.size() - 1);
    }

}
