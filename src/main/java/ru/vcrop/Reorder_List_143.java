package ru.vcrop;


/*https://leetcode.com/problems/reorder-list/
        Runtime: 1 ms, faster than 99.88% of Java online submissions for Reorder List.
        Memory Usage: 43.2 MB, less than 25.00% of Java online submissions for Reorder List.*/
public class Reorder_List_143 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private ListNode implementation(ListNode head, ListNode tail) {
        if (tail == null) return head;
        ListNode head1 = implementation(head, tail.next);
        if (head1 == null) return null;
        ListNode tmp = head1.next;
        if (head1 == tail) {
            head1.next = null;
            return null;
        }
        if (tmp == tail) {
            tail.next = null;
            return null;
        }
        ;
        head1.next = tail;
        tail.next = tmp;
        return tmp;
    }

    public void reorderList(ListNode head) {
        implementation(head, head);
    }
}
