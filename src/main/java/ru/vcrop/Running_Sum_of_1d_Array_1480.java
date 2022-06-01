package ru.vcrop;

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
        Memory Usage: 42.2 MB, less than 88.81% of Java online submissions for Running Sum of 1d Array.*/
public class Running_Sum_of_1d_Array_1480 {

    public int[] runningSum(int[] nums) {
        int[] ret = new int[nums.length];
        ret[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            ret[i] = ret[i - 1] + nums[i];
        return ret;
    }
}
