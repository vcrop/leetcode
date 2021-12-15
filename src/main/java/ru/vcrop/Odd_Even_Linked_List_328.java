package ru.vcrop;

/*https://leetcode.com/problems/odd-even-linked-list/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Odd Even Linked List.
        Memory Usage: 38.9 MB, less than 29.91% of Java online submissions for Odd Even Linked List.*/
public class Odd_Even_Linked_List_328 {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    private ListNode[] impl(ListNode l1, ListNode l2, ListNode s) {
        if (l1.next == null || l2.next == null) l1.next = s;
        else {
            ListNode[] l = impl(l1.next.next, l2.next.next, s);
            l1.next= l[0];
            l2.next = l[1];
        }
        return new ListNode[]{l1, l2};
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;
        return impl(head, head.next, head.next)[0];
    }

}
