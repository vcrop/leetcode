package ru.vcrop;

/*Runtime: 1 ms, faster than 61.76% of Java online submissions for Search in Rotated Sorted Array.
        Memory Usage: 42.5 MB, less than 55.16% of Java online submissions for Search in Rotated Sorted Array.*/
public class Search_in_Rotated_Sorted_Array_33 {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (nums[left] > nums[right]) {
            while (left < right) {
                int middle = (left + right) / 2;
                if (nums[left] < nums[middle]) left = middle;
                else right = middle;
            }
            int middle = left + 1;
            if (target <= nums[nums.length - 1]) {
                left = middle;
                right = nums.length - 1;
            } else {
                left = 0;
                right = middle;
            }
        }
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) return middle;
            if (nums[middle] > target) right = middle - 1;
            else left = middle + 1;
        }
        return -1;
    }
}
