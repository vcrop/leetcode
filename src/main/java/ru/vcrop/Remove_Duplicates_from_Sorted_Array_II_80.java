package ru.vcrop;

/*https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
Runtime: 1 ms, faster than 65.03% of Java online submissions for Remove Duplicates from Sorted Array II.
        Memory Usage: 45.5 MB, less than 6.26% of Java online submissions for Remove Duplicates from Sorted Array II.*/
public class Remove_Duplicates_from_Sorted_Array_II_80{

    public int removeDuplicates(int[] nums) {
        boolean repeat = false;
        int current = Integer.MIN_VALUE;
        int mark = 0;
        int pos = 0;
        int count = 0;
        while (pos < nums.length) {
            if (nums[pos] != current) {
                current = nums[mark] = nums[pos];
                repeat = false;
                mark++;
                count++;
            } else {
                if (!repeat) {
                    nums[mark] = nums[pos];
                    mark++;
                    count++;
                    repeat = true;
                };
            };
            pos++;
        }
        return count;
    }
}
