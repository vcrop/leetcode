package ru.vcrop;

/*Runtime: 1 ms, faster than 71.98% of Java online submissions for Merge Two Sorted Lists.
        Memory Usage: 43.1 MB, less than 26.48% of Java online submissions for Merge Two Sorted Lists.*/
public class Merge_Two_Sorted_Lists_21 {
    public static class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode tmp;
            if (list1 != null & list2 != null) {
                if (list1.val > list2.val) {
                    tmp = list2.next;
                    list2.next = mergeTwoLists(list1, tmp);
                    return list2;
                } else {
                    tmp = list1.next;
                    list1.next = mergeTwoLists(tmp, list2);
                    return list1;
                }
            };
            if (list1 == null && list2 == null) return null;
            if (list1 == null) {
                tmp = list2.next;
                list2.next = mergeTwoLists(list1, tmp);
                return list2;
            };
            tmp = list1.next;
            list1.next = mergeTwoLists(tmp, list2);
            return list1;
        }

    }
