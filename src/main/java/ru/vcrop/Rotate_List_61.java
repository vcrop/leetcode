package ru.vcrop;

public class Rotate_List_61 {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

        public ListNode[] solution(ListNode head, int[] k, int size) {
            ListNode[] result;
            if (head.next == null) {
                System.out.println(head.val);
                k[0] = k[0] % size;
                if (k[0] == 0) return null;
                return new ListNode[]{null, head};
            };
            result = solution(head.next, k, size + 1);
            if (--k[0] == 0) {
                result[0] = head.next;
                head.next = null;
            };
            return result;
        }

        public ListNode rotateRight(ListNode head, int k) {
            if (head == null) return null;
            if (k == 0) return head;
            ListNode[] result = solution(head, new int[]{k}, 1);
            if (result == null) return head;
            result[1].next = head;
            return result[0];
        }
}
