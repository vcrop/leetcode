package ru.vcrop;

public class Linked_List_Cycle_II_142 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if (slow == null) return null;

        do {
            slow = slow.next;
            if (fast.next == null || fast.next.next == null) return null;
            fast = fast.next.next;
        } while (slow != fast);

        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
