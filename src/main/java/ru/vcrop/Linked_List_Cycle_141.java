package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
        Memory Usage: 45.4 MB, less than 44.98% of Java online submissions for Linked List Cycle.*/
public class Linked_List_Cycle_141 {

      static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

        public boolean hasCycle(ListNode head) {
            if (head == null) return false;
            ListNode slow = head;
            ListNode fast = head;
            while (true) {
                if (slow.next == null || fast.next == null || fast.next.next == null) return false;
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) return true;
            }
        }
}
