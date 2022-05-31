package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Nodes in k-Group.
        Memory Usage: 46.5 MB, less than 6.77% of Java online submissions for Reverse Nodes in k-Group.*/
public class Reverse_Nodes_in_k_Group_25 {

    public static class ListNode {
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

        @Override
        public String toString() {
            return Integer.toString(val);
        }
    }

    private ListNode solution(ListNode head, int k) {
        ListNode h = head;
        int i = k;
        while (i-- != 0 && h != null) h = h.next;
        if (i != -1) return head;

        h = head;
        ListNode pred = null;
        i = k;

        while (i-- != 0) {
            ListNode tmp = head.next;
            head.next = pred;
            pred = head;
            head = tmp;
        }

        h.next = solution(head, k);
        return pred;
    }


    public ListNode reverseKGroup(ListNode head, int k) {
        return solution(head, k);
    }
}
