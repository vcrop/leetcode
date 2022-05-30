package ru.vcrop;

import java.util.Comparator;
import java.util.function.IntPredicate;

/*Runtime: 6 ms, faster than 7.07% of Java online submissions for Find First and Last Position of Element in Sorted Array.
        Memory Usage: 47.1 MB, less than 53.04% of Java online submissions for Find First and Last Position of Element in Sorted Array.*/

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 {

    private int solution(int[] nums, int target, IntPredicate predicate, Comparator<Integer> comparator) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (predicate.test(middle)) return middle;
            if (comparator.compare(middle, target) > 0) right = middle - 1;
            else left = middle + 1;
        }

        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        int[] result = new int[2];


        result[0] = solution(nums, target, el -> nums[el] == target && (el == 0 || nums[el - 1] != target), (a, b) -> nums[a] >= b ? 1 : -1);
        if (result[0] == -1) return new int[]{-1, -1};


        result[1] = solution(nums, target, el -> nums[el] == target && (el == nums.length - 1 || nums[el + 1] != target), (a, b) -> nums[a] <= b ? -1 : 1);

        return result;
    }
}
