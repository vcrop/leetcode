package ru.vcrop;

/*https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
Runtime: 42 ms, faster than 11.09% of Java online submissions for Maximum Twin Sum of a Linked List.
        Memory Usage: 137.8 MB, less than 5.06% of Java online submissions for Maximum Twin Sum of a Linked List.*/
public class Maximum_Twin_Sum_of_a_Linked_List_2130 {

    private int solution(Linked_List_in_Binary_Tree_1367.ListNode[] head, Linked_List_in_Binary_Tree_1367.ListNode end) {
        if (end == null) return Integer.MIN_VALUE;
        int result = solution(head, end.next);
        result = Math.max(head[0].val + end.val, result);
        head[0] = head[0].next;
        return result;
    }

    public int pairSum(Linked_List_in_Binary_Tree_1367.ListNode head) {
        return solution(new Linked_List_in_Binary_Tree_1367.ListNode[]{head}, head);
    }
}
