package ru.vcrop;

/*https://leetcode.com/problems/remove-nth-node-from-end-of-list/
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
        Memory Usage: 36.9 MB, less than 81.67% of Java online submissions for Remove Nth Node From End of List.*/
public class Remove_Nth_Node_From_End_of_List_19 {

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


    private ListNode solution(ListNode head, int[] n) {
        if (head == null) return null;
        ListNode ret = solution(head.next, n);
        if (--n[0] == 0) return ret;
        head.next = ret;
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        return solution(head, new int[]{n});
    }
}
