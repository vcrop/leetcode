package ru.vcrop;

/*https://leetcode.com/problems/add-two-numbers/
        Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.
        Memory Usage: 38.9 MB, less than 98.13% of Java online submissions for Add Two Numbers.*/
public class Add_Two_Numbers_2 {

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

    private ListNode implementation(ListNode l1, ListNode l2, int additional) {
        if (l1 == null && l2 == null)
            return additional != 0 ? new ListNode(additional) : null;
        l1 = l1 == null ? new ListNode(0) : l1;
        l2 = l2 == null ? new ListNode(0) : l2;
        l1.val += l2.val + additional;
        l1.next = implementation(l1.next, l2.next, l1.val / 10);
        l1.val %= 10;
        return l1;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return implementation(l1, l2, 0);
    }
}
