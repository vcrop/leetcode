package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
        Memory Usage: 54.9 MB, less than 10.34% of Java online submissions for Binary Search.*/
public class Binary_Search_704 {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (high >= low) {
            int middle = (high + low) / 2;
            if (nums[middle] == target) return middle;
            if (nums[middle] > target) high = middle - 1;
            else low = middle + 1;
        }
        return -1;
    }

}
