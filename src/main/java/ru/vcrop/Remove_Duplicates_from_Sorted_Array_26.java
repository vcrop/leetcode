package ru.vcrop;

/*https://leetcode.com/problems/remove-duplicates-from-sorted-array/
        Runtime: 1 ms, faster than 81.52% of Java online submissions for Remove Duplicates from Sorted Array.
        Memory Usage: 39.9 MB, less than 98.79% of Java online submissions for Remove Duplicates from Sorted Arra*/
public class Remove_Duplicates_from_Sorted_Array_26 {

    public int removeDuplicates(int[] nums) {
        int curr = 0;
        for (int i = 1; i < nums.length; i++)
            if (nums[curr] != nums[i]) nums[++curr] = nums[i];
        return curr + 1;
    }
}
