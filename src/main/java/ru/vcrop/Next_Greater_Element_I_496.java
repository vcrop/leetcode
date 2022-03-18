package ru.vcrop;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*Runtime: 2 ms, faster than 97.85% of Java online submissions for Next Greater Element I.
        Memory Usage: 42.1 MB, less than 79.54% of Java online submissions for Next Greater Element I.*/
public class Next_Greater_Element_I_496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> deque = new LinkedList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = nums2.length - 1; i > -1; i--) {
            while (!deque.isEmpty() && deque.getFirst() < nums2[i]) deque.pop();
            map.put(nums2[i], deque.isEmpty() ? -1 : deque.getFirst());
            deque.push(nums2[i]);
        };
        for (int i = 0; i < nums1.length; i++)
            nums1[i] = map.get(nums1[i]);
        return nums1;
    }
}
