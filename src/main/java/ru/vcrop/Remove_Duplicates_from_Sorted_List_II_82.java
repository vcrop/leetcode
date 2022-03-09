package ru.vcrop;

/*Runtime: 1 ms, faster than 77.24% of Java online submissions for Remove Duplicates from Sorted List II.
        Memory Usage: 44.1 MB, less than 17.20% of Java online submissions for Remove Duplicates from Sorted List II.*/
public class Remove_Duplicates_from_Sorted_List_II_82 {

      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


        private ListNode solution(ListNode head, int except) {
            if (head.next != null)
                if (head.next.val == head.val || head.val == except)
                    return solution(head.next, head.val);
                else {
                    head.next = solution(head.next, head.val);
                    return head;
                }
            else if (head.val == except) return null;
            else return head;
        }

        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) return null;
            return solution(head, Integer.MIN_VALUE);
        }
}
