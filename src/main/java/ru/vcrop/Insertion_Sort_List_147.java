package ru.vcrop;

public class Insertion_Sort_List_147 {

      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode insertionSortList(ListNode head) {

        ListNode head_reverse = null;

        while (head != null) {
            ListNode tmp_next = head.next;
            ListNode curr = head_reverse;
            if (head_reverse != null && head.val < curr.val) {
                while (curr.next != null && head.val < curr.next.val) curr = curr.next;
                ListNode tmp = curr.next;
                curr.next = head;
                head.next = tmp;
            } else {
                head.next = head_reverse;
                head_reverse = head;
            }

            head = tmp_next;
        }

        ListNode tmp_next= null;

        while (head_reverse != null) {
            ListNode tmp = head_reverse.next;
            head_reverse.next = tmp_next;
            tmp_next = head_reverse;
            head_reverse = tmp;
        }

        return tmp_next;
    }


}
