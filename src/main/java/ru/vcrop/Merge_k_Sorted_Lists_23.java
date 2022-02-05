package ru.vcrop;

import java.util.Comparator;
import java.util.PriorityQueue;

/*https://leetcode.com/problems/merge-k-sorted-lists/
Runtime: 5 ms, faster than 64.45% of Java online submissions for Merge k Sorted Lists.
        Memory Usage: 43.9 MB, less than 57.10% of Java online submissions for Merge k Sorted Lists.*/
public class Merge_k_Sorted_Lists_23 {

      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


        public ListNode mergeKLists(ListNode[] lists) {

            PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n.val));

            ListNode root = null;
            ListNode last = null;

            for (ListNode n: lists) if (n != null) queue.add(n);

            while(!queue.isEmpty()) {
                ListNode tmp = queue.poll();
                if (root == null) root = tmp;
                if (last != null) last.next = tmp;
                last = tmp;
                if (last.next != null) queue.add(last.next);
            }

            return root;
        }
}
