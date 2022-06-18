package ru.vcrop;

import java.util.Arrays;

public class Running_Sum_of_1d_Array_75 {

    public int[] runningSum(int[] nums) {
        int[] ret  = new int[nums.length];
        Arrays.setAll(ret, n -> (n != 0 ? ret[n - 1] : 0) + nums[n]);
        return ret;
    }
}
