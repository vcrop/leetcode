package ru.vcrop;

/*https://leetcode.com/problems/swap-nodes-in-pairs/
Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
        Memory Usage: 41.3 MB, less than 23.19% of Java online submissions for Swap Nodes in Pairs.*/
public class Swap_Nodes_in_Pairs_26 {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

        private ListNode solution(ListNode head) {
            if (head == null) return null;
            ListNode next = head.next;
            if (next == null) return head;
            ListNode tmp = next.next;
            next.next = head;
            head.next = solution(tmp);
            return next;
        }

        public ListNode swapPairs(ListNode head) {
            return solution(head);
        }
}
